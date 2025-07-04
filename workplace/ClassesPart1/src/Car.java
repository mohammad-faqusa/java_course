public class Car {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public String getMake() {
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

    public void setMake(String make) {
        if (make == null || make.isEmpty()) {
            make = "Unknown";
        }
        String lowercaseMake = make.toLowerCase();
        switch(lowercaseMake) {
            case "hondai", "porsche", "tesla", "holden" -> this.make = make;
            default -> this.make = "Unsupported";
        }
    }

    public void describeCar() {
        System.out.println(doors + "-Door " + model + "-Model " + color + "-Color " + make + "-Make " + (convertible ? "Convertable" : ""));
    }
}
