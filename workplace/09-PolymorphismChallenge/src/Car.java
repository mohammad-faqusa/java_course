public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    public void drive() {
        System.out.println("Car -> drive, type is " + this.getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }
}

class GasPoweredCar extends Car {

    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("GasPoweredCar -> %d are fired ", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}

class ElectricCar extends Car {

    private double avgPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgPerCharge, int batterySize) {
        super(description);
        this.avgPerCharge = avgPerCharge;
        this.batterySize= batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("ElectricCar -> %d is the battery size ", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("ElectricCar -> usage exceeds the average: %.2f %n", avgPerCharge);
    }
}

class HybridCar extends Car {

    private double avgPerCharge;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgPerCharge, int batterySize, int cylinders) {
        super(description);
        this.avgPerCharge = avgPerCharge;
        this.batterySize= batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("HybridCar -> %d is the battery size ", batterySize);
        System.out.printf("HybridCar -> %d is the number of  cylinders", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("HybridCar -> usage exceeds the average: %.2f %n", avgPerCharge);
    }
}

