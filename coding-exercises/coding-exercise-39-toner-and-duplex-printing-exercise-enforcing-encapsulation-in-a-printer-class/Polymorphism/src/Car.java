public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = false;
        this.wheels = 0;
    }

    public void startEngine() {
        System.out.print("Car -> startEngine()");
    }

    public void accelerate() {
        System.out.print("Car -> accelerate()");
    }

    public void brake() {
        System.out.print("Car -> brake()");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
