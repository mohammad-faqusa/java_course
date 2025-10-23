import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
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

//        Stream.generate(()-> Student.getRandomStudent(jmc, pymc))
//                .limit(10)
//                .forEach(System.out::println);

        Student[] students = new Student[1000];

        Arrays.setAll(students, (i) -> Student.getRandomStudent(pymc, jmc));

        var maleStudents = Arrays.stream(students)
                .filter(s -> s.getGender().equals("M"));

        System.out.println("Males students : " + maleStudents.count());

        for(var gender : List.of("M", "F", "U")) {
            var selected = Arrays.stream(students)
                    .filter(s -> s.getGender().equals(gender));
            System.out.println("# of " + gender + "students : " + selected.count());
        }

        List<Predicate<Student>> list = List.of(
                (s) -> s.getAge() < 30,
                (Student s) -> s.getAge() >= 30 && s.getAge() < 60
        );

        long total = 0;
        for (int i = 0; i < list.size(); i++) {
            var myStudents = Arrays.stream(students)
                    .filter(list.get(i));
            long cnt = myStudents.count();
            System.out.printf("# of students (%s) = %d%n",
                    i == 0 ? " < 30 " : ">= 30 && < 60", cnt);
            total+=cnt;
        }

        System.out.println("# of students > 60 : " + (students.length - total) );
    }
}