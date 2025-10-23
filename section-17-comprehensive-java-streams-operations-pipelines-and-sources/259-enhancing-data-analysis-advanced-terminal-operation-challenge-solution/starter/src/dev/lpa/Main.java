package dev.lpa;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Course pymc= new Course("PYMC", "Python Masterclass");
        Course jmc= new Course("JMC", "Java Masterclass");
//        Student tim = new Student("AU", 2019, 30, "M",
//                true, jmc, pymc);
//        System.out.println(tim);
//
//        tim.watchLecture("JMC", 10, 5, 2019);
//        tim.watchLecture("PYMC", 7, 7, 2020);
//        System.out.println(tim);

//        Stream.generate(() -> Student.getRandomStudent(jmc, pymc))
//                .limit(10)
//                .forEach(System.out::println);

        Student[] students = new Student[1000];
        Arrays.setAll(students, i -> Student.getRandomStudent());

        List<Predicate<Student>> list = List.of(
                (s) -> s.getAge() < 30,
                s -> s.getAge() >= 30 && s.getAge()<= 60
        );

        for(var l : list) {
            long count = Arrays.stream(students)
                    .filter(l)
                    .count();
            System.out.println("# of students : " + count);
        }

        var ageStream = Arrays.stream(students)
                .mapToInt(Student::getAgeEnrolled);
//                .summaryStatistics();
        System.out.println("Status for Enrollment age = " + ageStream.summaryStatistics());

        var currentAgeStream = Arrays.stream(students)
                .mapToInt(Student::getAgeEnrolled);
//                .summaryStatistics();
        System.out.println("Status for currentAgeStream = " + currentAgeStream.summaryStatistics());

        Arrays.stream(students)
                .map(Student::getCountryCode)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        boolean longTerm = Arrays.stream(students)
                .anyMatch(s -> (s.getAge() - s.getAgeEnrolled() >= 7) && s.getMonthsSinceActive() < 12);
        System.out.println("Long term: " + longTerm);

        long longTermCount = Arrays.stream(students)
                .filter(s -> (s.getAge() - s.getAgeEnrolled() >= 7) && s.getMonthsSinceActive() < 12)
                .count();
        System.out.println("Long term count : " + longTermCount);

    }
}
