public class Hourse extends Mammal{

    public Hourse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair(){
        System.out.println(getExplicitType() + "Hourse Shed hair.");
    }

    @Override
    public void makeNoise() {
        System.out.println(getExplicitType() + "Hourse make noise.");
    }
}
