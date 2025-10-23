package dev.lpa;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainCollect {

    public static void main(String[] args) {

        Course pymc= new Course("PYMC", "Python Masterclass");
        Course jmc= new Course("JMC", "Java Masterclass");

        List<Student> students = Stream.generate(()-> Student.getRandomStudent(pymc, jmc))
                .limit(1000)
                .toList();

        Set<Student> australiansStudents = students.stream()
                .filter(s -> s.getCountryCode().equals("AU"))
                .collect(Collectors.toSet());
        System.out.println("# of Australian students : " + australiansStudents.size());

        Set<Student> underThirty = students.stream()
                .filter(s -> s.getAge() < 30)
                .collect(Collectors.toSet());
        System.out.println("# of Australian students : " + underThirty.size());

        Set<Student> youngAus = new TreeSet<>(Comparator.comparing(Student::getAge));

        youngAus.addAll(australiansStudents);
        youngAus.retainAll(underThirty);
        youngAus.forEach((s)-> System.out.print(s.getStudentId() + " "));
        System.out.println();

        Set<Student> youngAus2 = students.stream()
                .filter(s -> s.getAge() < 30)
                .filter(s -> s.getCountryCode().equals("AU"))
                .collect(()-> new TreeSet<>(Comparator.comparing(Student::getAge)), TreeSet::add, TreeSet::addAll);
        System.out.println("# of Australian students : " + underThirty.size());

        youngAus2.forEach(s -> System.out.print(s.getStudentId() + " "));

        System.out.println();
        var coutrnyList = students.stream()
                .map(Student::getCountryCode)
                .distinct()
                .sorted()
                .reduce("", (r, v) -> r + " " + v);
        System.out.println(coutrnyList);

    }
}
