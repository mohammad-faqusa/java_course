public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal" , "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog("Yoki", 20);
        doAnimalStuff(dog, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65,
                "Floppy", "Swimmer");

        doAnimalStuff(retriever, "slow");

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
