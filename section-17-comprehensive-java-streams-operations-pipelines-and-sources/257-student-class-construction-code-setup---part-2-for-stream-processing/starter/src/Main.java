import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Course pymc = new Course("PYMC", "Pythin master class");
        Course jmc = new Course("JMC", "java master class");

        Student mohammad = new Student("PL", 2019, 20, "M", true, jmc, pymc  );
        System.out.println(mohammad);

        mohammad.watchLecture("PYMC", 10, 5, 2020);
        mohammad.watchLecture("JMC", 7 , 4, 2019);

        System.out.println(mohammad);

        Stream.generate(()-> Student.getRandomStudent(jmc, pymc))
                .limit(10)
                .forEach(System.out::println);
    }
}