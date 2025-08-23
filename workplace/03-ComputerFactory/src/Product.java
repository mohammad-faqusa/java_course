public class Product {

    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }


}

class Monitor extends Product {

    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);

    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at (" + x + ", " + y + ") with color " + color + "");
    }
}


class Motherboard extends Product {


    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public void loadProgram(String porgram) {
        System.out.println("Loading program " + porgram + "...");
    }
}

class ComputerCase extends Product {

    private String powerSubbly ;

    public ComputerCase(String model, String manufacturer, String powerSubbly) {
        super(model, manufacturer);
        this.powerSubbly = powerSubbly;
    }

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}
