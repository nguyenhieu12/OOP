import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<Shape>();

    /**
     * add.
     */
    public void addShape(Shape shape) {
        if (shape == null) {
            return;
        } else {
            shapes.add(shape);
        }
    }

    /**
     * removeCirlce.
     */
    public void removeCircles() {
        for (int i = shapes.size() - 1; i >= 0; i--) {
            if (shapes.get(i) instanceof Circle) {
               shapes.remove(i);
            }
        }
    }

    /**
     * getInfo.
     */
    public String getInfo() {
        String s = "Layer of crazy shapes:" + "\n";
        for (int i = 0; i < shapes.size(); i++) {
            s += shapes.get(i) + "\n";
        }
        return s;
    }

    /**
     * removeDuplicates.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size() - 1; i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).hashCode() == shapes.get(j).hashCode()) {
                    shapes.remove(j);
                }
            }
        }
    }

}
