import java.util.List;

public class ShapeUtil {
    /**
     * shape.
     */
    public String printInfo(List<GeometricObject> shapes) {
        String s = "Circle:\n";
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                Circle cur = (Circle) shapes.get(i);
                s += cur.getInfo() + "\n";
            }
        }
        s += "Triangle:\n";
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Triangle) {
                Triangle cur = (Triangle) shapes.get(i);
                s += cur.getInfo() + "\n";
            }
        }
        return s;
    }
}
