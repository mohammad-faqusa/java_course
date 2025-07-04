public class Main {
    public static void main(String[] args) {
//        Car car = null ; // not syntax error, but NullPointerException
//        Car car ; // error uninitialized
        Car car = new Car();
        car.describeCar();

        car.setMake("Hondai");
        System.out.println("Car is made in " + car.getMake());
        car.setMake("Masda");
        System.out.println("Car is made in " + car.getMake());
        car.describeCar();
    }
}
