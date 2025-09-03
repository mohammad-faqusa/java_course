import java.lang.reflect.Array;
import java.util.ArrayList;

record OrderItem(int quantity, SaleForProduct product){}

public class Store {

    private static ArrayList<SaleForProduct> products = new ArrayList<>();

    public static void main(String[] args) {

        products.add(new ArtObject("painting", 100.0, "a beautiful painting"));
        products.add(new ArtObject("sculpture", 150.0, "a beautiful sculpture"));
        products.add(new ArtObject("painting", 120.0, "a beautiful painting but more expensive"));

        listProducts();

        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0 , 1);
        printOrder(order1);

    }

    public static void listProducts() {
        for (SaleForProduct product : products) {
            product.printDescription();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> orderItems, int orderIndex, int quantity) {

        orderItems.add(new OrderItem(quantity, products.get(orderIndex)));

    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;

        for(var item : order) {
            item.product().printPricedItem(item.quantity());
            item.product().printDescription();
            salesTotal += item.product().getSalesPrice(item.quantity());

        }
    }
}
