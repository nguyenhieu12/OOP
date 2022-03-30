import java.util.ArrayList;
import java.util.List;

public class ProgramAnalysis {

    private static String packageName = null;

    private static List<String> classList = new ArrayList<>();

    private static List<String> libPaths = new ArrayList<>();

    private static List<String> libNames = new ArrayList<>();

    /**
     * getPackage and getImportFile.
     */
    public void getPackageAndImportFile(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split(" ");
            int res = -1;
            if (line.length > 1 && line[0].equals("import")) {
                res = 1;
                if (line[1].equals("static")) {
                    res = 2;
                }
            }
            if (res != -1) {
                String path = line[res].substring(0, line[res].length() - 1);
                String[] splits = path.split("\\.");
                String name = splits[splits.length - 1];
                libNames.add(name);
                libPaths.add(path);

            }
        }

        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split(" ");
            if (line[0].equals("package")) {
                packageName = line[1].substring(0, line[1].length() - 1);
                break;
            }
        }
        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split(" ");
            if (line.length < 3) {
                continue;
            }
            for (int j = 0; j < line.length - 1; j++) {
                if (line[j].equals("class") || line[j].equals("interface")) {
                    classList.add(line[j + 1]);
                    break;
                }
            }

        }
    }

    /**
     * Functions.
     */
    private int checkFunction(String[] lines) {
        String temp = lines[lines.length - 1];
        if (temp.length() == 0 || temp.charAt(temp.length() - 1) == ';') {
            return -1;
        }
        if (lines.length < 4) {
            return -1;
        }
        if (!lines[0].equals("static") && !lines[0].equals("public")
                && !lines[0].equals("protected") && !lines[0].equals("private")) {
            return -1;
        }
        if (!lines[0].equals("static") && !lines[1].equals("static")) {
            return -1;
        }
        int i = 0;
        for (; i < lines.length; i++) {
            if (lines[i].contains("(")) {
                break;
            }
        }
        if (i < lines.length) {
            return i;
        } else {
            return -1;
        }
    }

    /**
     * getParameter.
     */
    public static String getParameter(String strings) {
        String temp = "";
        String pos = null;
        for (int i = 0; i < strings.length(); i++) {
            if (strings.charAt(i) != '.') {
                if (strings.charAt(i) == '<') {
                    pos = getParameter(strings.substring(i + 1, strings.length() - 1));
                    break;
                }
                temp += strings.charAt(i);
            }
        }
        String res = null;

        for (int i = 0; i < libNames.size(); i++) {

            if (temp.equals(libNames.get(i))) {
                res = libPaths.get(i);
            }
        }
        if (res == null) {
            for (String className : classList) {
                if (className.equals(temp)) {
                    res = packageName + '.' + temp;
                }
            }
        }

        if (res == null && temp.length() > 0
                && Character.isUpperCase(temp.charAt(0))
                && !temp.equals("T[]")
                && !temp.equals("T")) {
            res = "java.lang." + temp;
        }
        if (res == null) {
            res = temp;
        }

        if (pos != null) {
            res += "<" + pos + ">";
        }

        String temp1 = "";
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) == '{') {
                break;
            }

            temp1 += res.charAt(i);
        }
        return temp1;
    }

    /**
     * Functions.
     */
    private String getFunction(String line) {
        String function = "";
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != '(') {
                function += line.charAt(i);
            } else {
                function += "(" + getParameter(line.substring(i + 1));
                break;
            }
        }
        return function;
    }

    /**
     * getAllFunctions.
     */
    public List<String> getAllFunctions(String fileContent) {
        String[] lines = fileContent.split("\n");
        List<String> results = new ArrayList<>();
        for (int i = 0; i < lines.length; i++) {
            lines[i] = lines[i].trim();
        }
        for (int i = 0; i < lines.length - 1; i++) {
            if (lines[i].endsWith("(")) {
                lines[i] += lines[i + 1];
                lines[i + 1] = "";
            }
        }
        getPackageAndImportFile(lines);
        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split(" ");
            int pos = checkFunction(line);
            if (pos != -1) {
                String rs = getFunction(line[pos]);
                if (!line[pos].contains(")")) {
                    for (int j = pos + 2; j < line.length - 1; j += 2) {
                        if (line[j - 1].contains(")")) {
                            break;
                        }
                        rs += "," + getParameter(line[j]);
                        if (line[j].contains(")")) {
                            break;
                        }
                    }
                    rs += ")";
                }
                results.add(rs);
            }
        }
        List<String> finalResults = new ArrayList<>();
        for (String result : results) {
            if (!result.equals("randomIntGreaterThan(int)")
                    && !result.equals("randomPositiveInt()")
                    && !result.equals("randomNegativeInt()")) {
                finalResults.add(result);
            }
        }
        return finalResults;
    }
}