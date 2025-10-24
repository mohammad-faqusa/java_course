package dev.lpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainOptional {

    public static void main(String[] args) {

        Course pymc= new Course("PYMC", "Python Masterclass");
        Course jmc= new Course("JMC", "Java Masterclass");

        List<Student> students = Stream.generate(()-> Student.getRandomStudent(pymc, jmc))
                .limit(1000)
                .collect(Collectors.toList());

        Optional<Student> o1 = getStudent(new ArrayList<>(), "first");
        System.out.println("Empty = " + o1.isEmpty() + ", is Present : " + o1.isPresent());
        System.out.println(o1);
//        System.out.println(o1.get());
        o1.ifPresentOrElse(System.out::println, () -> System.out.println("--- Empty"));

        Optional<Student> o2 = getStudent(students, "first");
        System.out.println("Empty = " + o2.isEmpty() + ", is Present : " + o2.isPresent());
        System.out.println(o2);
//        System.out.println(o2.get());
        o2.ifPresent(System.out::println);

        Student firstStudent = o2.orElseGet(()->getDummyStudent(pymc, jmc));
        long studentId = firstStudent.getStudentId();
        System.out.println(studentId);

        List<String> countries = students.stream().map(Student::getCountryCode).distinct().toList();

        Optional.of(countries)
                .map(l -> String.join(",", l))
                .filter(l -> l.contains("FR"))
                .ifPresentOrElse(System.out::println, ()-> System.out.println("Missing FR"));

        String name = "moham mad";
        Optional.of(name)
                .map(n -> n.split(" "))
                .filter(l -> (Optional.ofNullable(l[1]).orElseGet(()-> "mod")).equals("mad"))
                .ifPresentOrElse(s -> System.out.println(s[0]), ()-> System.out.println("empty"));


    }

    private static Optional<Student> getStudent(List<Student> list, String type) {
        if(list == null || list.size() == 0)
            return Optional.empty();
        else if (type.equals("first")) {
            return Optional.ofNullable(list.get(0));
        } else if (type.equals("last")) {
            return Optional.ofNullable(list.get(list.size() - 1));
        }

        return Optional.ofNullable(list.get(new Random().nextInt(list.size())));

    }

    private static Student getDummyStudent(Course... courses) {
        System.out.println("Getting dummy student .... ");
        return new Student("PA", 2010, 18, "M", true, courses);

    }
}
