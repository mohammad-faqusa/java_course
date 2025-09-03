public class ArtObject extends SaleForProduct{

    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void printDescription() {
        System.out.println("This is an art object , which is a type of " + type);
        System.out.println("here is the price of this art product : " + price);
        System.out.println("here is the description of this art product : " + description);
    }
}
