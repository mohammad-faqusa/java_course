import java.util.ArrayList;
import java.util.List;

public class Layer <T extends Mappable> {

    private List<T> listElements;

    public Layer(T[] elements) {
        listElements = new ArrayList<T>(List.of(elements));
    }

    public void addElements(T... elements) {
        listElements.addAll(List.of(elements));
    }

    public void renderLayer() {
        for (T element : listElements) {
            element.render();
        }
    }
}
