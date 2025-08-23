public class SmartKitchen {

    private Refrigerator refrigerator;
    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;

    public SmartKitchen() {
        this.refrigerator = new Refrigerator();
        this.dishWasher = new DishWasher();
        this.coffeeMaker = new CoffeeMaker();
    }

    public void setKitchenState( boolean coffeFlag , boolean refrigeratorFlag, boolean dishWasherFlag){
        coffeeMaker.setHasWorkToDo(coffeFlag);
        refrigerator.setHasWorkToDo(refrigeratorFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }
    public void doKitchenWork() {
        refrigerator.orderFood();
        dishWasher.doDishes();
        coffeeMaker.brewCoffee();
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }
}


// 3. create coffee maker class  :

class CoffeeMaker {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {

        if(hasWorkToDo) {
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}

// 4. copy and paste the coffee maker to refrigerator

class Refrigerator {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {

        if(hasWorkToDo) {
            System.out.println("Ordering food");
            hasWorkToDo = false;
        }
    }
}

// 5. dish washer :

class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {

        if(hasWorkToDo) {
            System.out.println("cleaning dishes");
            hasWorkToDo = false;
        }
    }
}