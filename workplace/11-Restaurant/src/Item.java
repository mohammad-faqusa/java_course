public class Item {
    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";

    public Item(String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        if(type.toUpperCase().equals("SIDE") || type.toUpperCase().equals("DRINK"))
            return type + " " + name;

        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return price + switch (size) {
            case "SMALL" -> 0.5;
            case "MEDIUM" -> 0.0;
            case "LARGE" -> 0.75;
            default -> 0.0;
        };
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price );
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }
}