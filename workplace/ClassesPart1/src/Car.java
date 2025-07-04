public class Car {

    private String make ;
    private String model ;
    private String color ;
    private int doors;
    private boolean convertible ;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-Door "+ model + "-Model " + color + "-Color " + make + "-Make " + (convertible ? "Convertable" : "") );
    }
}
