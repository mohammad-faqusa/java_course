public class Furnature extends SaleForProduct{

    public Furnature(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void printDescription() {
        System.out.println("This is an furnature  object , which is a type of " + type);
        System.out.println("here is the price of this furnature product : " + price);
        System.out.println("here is the description of this furnature product : " + description);
    }
}
