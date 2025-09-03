public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {
        System.out.println("Fish swim!");
    }

    @Override
    public void move(String speed) {
        System.out.println("Fish swim at " + speed + " miles per hour.");
    }
}
