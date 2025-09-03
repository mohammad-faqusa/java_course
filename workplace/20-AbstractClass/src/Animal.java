abstract class Mammal extends Animal {
    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType()+" Run at " + speed + " miles per hour.");

    }

    public abstract void shedHair();
}


public abstract class Animal {

    protected String type ;
    private String size;
    private double weight ;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public String getExplicitType() {
        return getClass().getSimpleName() + " ( " + type + " ) " ;
    }

    public abstract void move(String speed); // no default behaviour
    public abstract void makeNoise();
}
