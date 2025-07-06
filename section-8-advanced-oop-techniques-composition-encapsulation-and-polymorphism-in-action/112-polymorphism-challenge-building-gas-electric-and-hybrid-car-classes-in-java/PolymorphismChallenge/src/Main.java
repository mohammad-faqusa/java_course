public class Main {
    public static void main(String [] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferreri = new GasPoweredCar("Ferreri" , 15.4, 6);
        runRace(ferreri);

    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}