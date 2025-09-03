import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog( "Large", 10.0);
        dog.makeNoise();
        dog.move("Fast");

        Animal fish = new Fish("Fish", "Small", 1.0);
        fish.makeNoise();
        fish.move("Slow");

        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(dog);
        animals.add(fish);
        animals.add(new Dog( "Small", 10.0));
        animals.add(new Hourse("horse", "large", 200));
        for (Animal a : animals) {
            a.makeNoise();
            a.move("Slow");
            if(a instanceof Mammal currentMammal) {
                currentMammal.shedHair();
            }
        }
    }
}