import java.util.Collections;
import java.util.List;

public class Week10 {
    /**
     * sortGeneric.
     */
    public static <T> List sortGeneric(List<T> a) {
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i) instanceof Integer) {
                    Integer integer1 = (Integer) a.get(i);
                    Integer integer2 = (Integer) a.get(j);
                    if (integer1 > integer2) {
                        Collections.swap(a, i, j);
                    }
                }
                if (a.get(i) instanceof String) {
                    String s1 = (String) a.get(i);
                    String s2 = (String) a.get(j);
                    if (s1.compareTo(s2) > 0) {
                        Collections.swap(a, i, j);
                    }
                }
                if (a.get(i) instanceof Person) {
                    Person person1 = (Person) a.get(i);
                    Person person2 = (Person) a.get(j);
                    if (person1.getName().compareTo(person2.getName()) > 0) {
                        Collections.swap(a, i, j);

                    }
                    if ((person1.getName().compareTo(person2.getName())) == 0) {
                        if (person1.getAge() > person2.getAge()) {
                            Collections.swap(a, i, j);
                        }
                    }
                }
            }
        }

        return a;
    }

}





