package dev.lpa;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.* ;

public class MainMapping {

    public static void main(String[] args) {
        Course pymc= new Course("PYMC", "Python Masterclass");
        Course jmc= new Course("JMC", "Java Masterclass");

        List<Student> students = IntStream
                .rangeClosed(1, 5000)
                .mapToObj(s -> Student.getRandomStudent(pymc, jmc))
                .toList();

        var mappedStudents = students.stream()
                .collect(Collectors.groupingBy(Student::getCountryCode));
        mappedStudents.forEach((k, v) -> System.out.println(k + " " + v.size()));

        System.out.println("--------------------------------------");
        int minAge = 25;
        var youngSet = students.stream()
                .collect(Collectors.groupingBy(Student::getCountryCode,
                        filtering(s -> s.getAge() <= minAge, toList())));

        var youngSet2 = students.stream()
                        .filter(s -> s.getAge() <= minAge)
                                .collect(Collectors.groupingBy(Student::getCountryCode));


        youngSet.forEach((k, v) -> System.out.println(k + " " + v.size()));
        System.out.println("--------------------------------------");
        youngSet2.forEach((k, v) -> System.out.println(k + " " + v.size()));

        var experiance = students.stream()
                .collect(Collectors.partitioningBy(Student::hasProgrammingExperience));

        var experianceCount = students.stream()
                .collect(Collectors.partitioningBy(Student::hasProgrammingExperience, counting()));

        System.out.println("Experianced students : " + experiance.get(false).size());
        System.out.println("Experianced students : " + experianceCount.get(false));

        var experianceCountAnActive = students.stream()
                .collect(Collectors.partitioningBy(
                        s -> s.hasProgrammingExperience() && s.getMonthsSinceActive() == 0, counting()));
        System.out.println(experianceCountAnActive);

        var multiLevel = students.stream()
                .collect(groupingBy(Student::getCountryCode, groupingBy(Student::getGender, filtering(Student::hasProgrammingExperience, toList()))));

        var multiLevel2 = students.stream()
                .collect(groupingBy(Student::getCountryCode, groupingBy(Student::getGender)));

        multiLevel.forEach((key , value) -> {
            System.out.println(key);
            value.forEach((key1, value1) -> System.out.println(key1 + " " + value1.size()));
        });

        System.out.println("--------------------------------------------------------------------------------");
        multiLevel2.forEach((key , value) -> {
            System.out.println(key);
            value.forEach((key1, value1) -> System.out.println(key1 + " " + value1.size()));
        });


        long studentBodyCount = 0 ;
        for(var list : experiance.values()) {
            studentBodyCount += list.size();
        }
        System.out.println(studentBodyCount);


        studentBodyCount = experiance.values().stream().mapToInt(List::size).sum();
        System.out.println(studentBodyCount);

        studentBodyCount = experiance.values().stream()
                .map(l -> l.stream().filter(s -> s.getMonthsSinceActive() <= 3).count())
                .mapToLong(l -> l)
                .sum();
        System.out.println(studentBodyCount);

        long count = experiance.values().stream()
                .flatMap(Collection::stream)
                .filter(s -> s.getMonthsSinceActive() <= 3)
                .count();
        System.out.println("Active Students = " + count);


        count = multiLevel.values().stream()
                .flatMap(map -> map.values().stream()
                        .flatMap(l -> l.stream()))
                .filter(s -> s.getMonthsSinceActive() <= 3)
                .count();
        System.out.println("Active students in multilevel : " + count);


    }
}
