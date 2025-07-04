public class Car {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void describeCar(){
        System.out.println(doors + "-Door "+ model + "-Model " + color + "-Color " + make + "-Make " + (convertible ? "Convertable" : "Non-Convertable") );
    }
}
