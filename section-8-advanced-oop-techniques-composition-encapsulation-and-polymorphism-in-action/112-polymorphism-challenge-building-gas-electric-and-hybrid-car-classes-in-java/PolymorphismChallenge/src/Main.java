public class Main {
    public static void main(String [] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferreri = new GasPoweredCar("Ferreri" , 15.4, 6);
        runRace(ferreri);

        Car tesla = new ElectricCar("Tesla", 20, 100);
        runRace(tesla);

        Car elantra = new HybridCar("Elentra", 18, 5, 90);
        runRace(elantra);


    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}