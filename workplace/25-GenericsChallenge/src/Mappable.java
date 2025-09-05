public interface Mappable {

    void render();

    static double[] stringToLatLng(String location) {

        String[] strArr = location.split(",");
        double[] latLng = new double[2];

        latLng[0] = Double.parseDouble(strArr[0]);
        latLng[1] = Double.parseDouble(strArr[1]);

        return latLng;
    }
}

class Point implements Mappable {

    private double[] location;

    public Point(String location) {
        this.location = Mappable.stringToLatLng(location);
    }

    @Override
    public void render() {
        System.out.println("Rendering : " + (this) + " as point at " + printLocation());
    }

    private String printLocation() {
        return String.format("(%f, %f)", location[0], location[1]);
    }
}

abstract class Line implements Mappable {
    private double[][] locations;

    public Line(String []locations) {

        this.locations = new double[locations.length][];

        for (int i = 0; i < locations.length; i++) {
            this.locations[i] = Mappable.stringToLatLng(locations[i]);
        }
    }

    @Override
    public void render() {
        System.out.println("Rendering : " + (this) + " as line from " + printLocations());
    }

    private String printLocations() {
        String str = "";
        for (int i = 0; i < locations.length; i++) {
            str += String.format("(%f, %f)", locations[i][0], locations[i][1]);
            if (i != locations.length - 1) {
                str += ", ";
            }
        }
        return str;
    }
}

