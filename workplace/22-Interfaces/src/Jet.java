public class Jet implements  FlightEnabled , Trackable{

    @Override
    public void move() {
        System.out.println("Jet is moving");

    }

    @Override
    public void takeOff() {
        System.out.println( "Jet is taking off");
    }

    @Override
    public void land() {
        System.out.println("Jet is landing");
    }

    @Override
    public void fly() {
        System.out.println( "Jet is flying");
    }

    @Override
    public void track() {
        System.out.println("Jet is tracking");
    }
}
