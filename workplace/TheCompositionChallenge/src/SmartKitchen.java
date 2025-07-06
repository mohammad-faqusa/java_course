public class SmartKitchen {

    private CoffeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        this.brewMaster = new CoffeMaker();
        this.dishWasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }

    public CoffeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater() {
        brewMaster.brewCoffee();
    }

    public void pourMIlk() {
        iceBox.orderFood();
    }

    public void loadDishWasher() {
        dishWasher.doDishes();
    }

    public void setKitchenState(boolean coffeeFlag, boolean iceFlag, boolean dishFlag) {
        this.brewMaster.setHasWorkToDo(coffeeFlag);
        this.dishWasher.setHasWorkToDo(dishFlag);
        this.iceBox.setHasWorkToDo(iceFlag);
    }

    public void doKitchenWork() {
        this.brewMaster.brewCoffee();
        this.dishWasher.doDishes();
        this.iceBox.orderFood();
    }


}
