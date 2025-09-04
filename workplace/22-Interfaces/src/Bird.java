public class Bird extends Animal implements FlightEnabled , Trackable{

    @Override
    public void move() {
        System.out.println("Bird is moving");

    }

    @Override
    public void takeOff() {
        System.out.println( "Bird is taking off");
    }

    @Override
    public void land() {
        System.out.println("Bird is landing");
    }

    @Override
    public void fly() {
        System.out.println( "Bird is flying");
    }

    @Override
    public void track() {
        System.out.println("Bird is tracking");
    }
}
