public class Burger extends Item {

    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super("Burger", name, price);
    }

    @Override
    public String getName() {
        return super.getName() + " Burger";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                ((extra1 != null) ? extra1.getAdjustedPrice() : 0) +
                ((extra2 != null) ? extra2.getAdjustedPrice() : 0) +
                ((extra3 != null) ? extra3.getAdjustedPrice() : 0);
    }

    public double getExtraPrice(String toppingName) {

        return switch(toppingName.toLowerCase()) {
            case "AVOCADO", "CHEESE"-> 1.0;
            case "BACON", "HAN", "SALAMI" -> 1.5;
            default -> 0;
        };
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        this.extra1 = new Item("Topping", extra1, getExtraPrice(extra1));
        this.extra2 = new Item("Topping", extra2, getExtraPrice(extra1));
        this.extra3 = new Item("Topping", extra3, getExtraPrice(extra1));
    }

    public void printItemizedList() {

        printItem("BASE BURGER", getBasePrice());
        if(extra1 != null) extra1.printItem();
        if(extra2 != null) extra2.printItem();
        if(extra3 != null) extra3.printItem();
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}