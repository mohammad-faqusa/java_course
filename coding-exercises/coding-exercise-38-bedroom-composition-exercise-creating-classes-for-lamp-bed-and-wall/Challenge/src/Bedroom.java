public class Bedroom {

    private String name;
    private Wall wall1, wall2, wall3, wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2,
                   Wall wall3, Wall wall4,
                   Ceiling ceiling, Bed bed,
                   Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }
    public void makeBed() {
        bed.make();
    }
}

class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public int getGlobRating() {
        return globRating;
    }

    public void turnOn() {
        System.out.print("the lamp is being turned on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

}

class Bed {
    private String style;
    private int pillows, height, sheet, quilt;

    public Bed(String style, int pillows, int height, int sheet, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheet = sheet;
        this.quilt = quilt;
    }

    public void make() {
        System.out.print("the bed is being made");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheet;
    }

    public int getQuilt() {
        return quilt;
    }
}

class Ceiling {
    private int height, paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}

class Wall {
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
