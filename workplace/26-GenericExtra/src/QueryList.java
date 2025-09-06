import java.util.ArrayList;
import java.util.List;

public class QueryList <T extends QueryItem> {

    private List<T>  items;

    public QueryList (List<T> items) {
        this.items = items;
    }

    public List<T> getItems(String fieldName, String fieldValue) {

        List <T> result = new ArrayList<>();
        for(var item : items) {
            if(item.matchFieldValue(fieldName, fieldValue)) {
                result.add(item);
            }
        }
        return result;
    }
}
