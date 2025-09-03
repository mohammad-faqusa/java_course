public class Dog extends Mammal{

    public Dog( String size, double weight) {
        super("Dog", size, weight);
    }

    @Override
    public void shedHair(){
        System.out.println(getExplicitType() + "Dog Shed hair.");
    }

    @Override
    public void makeNoise() {
        System.out.println(getExplicitType() + "Bark!");
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType() + "Run at " + speed + " miles per hour.");
    }
}
