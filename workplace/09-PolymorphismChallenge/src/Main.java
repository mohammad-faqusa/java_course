//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car ferrari = new GasPoweredCar("Ferrari", 180, 5);
        carRace(ferrari);

        Car ford = new ElectricCar("Ford");
        carRace(ford);

        Car hyb = new HybridCar("Hyundai", 100, 10, 4);
        carRace(hyb);
    }

    public static void carRace(Car car){
        car.startEngine();
        car.drive();
    }
}