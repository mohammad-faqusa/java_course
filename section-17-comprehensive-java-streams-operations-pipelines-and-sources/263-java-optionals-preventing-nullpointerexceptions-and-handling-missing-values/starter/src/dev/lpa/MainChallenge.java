package dev.lpa;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MainChallenge {


    public static void main(String[] args) {
        Course pymc= new Course("PYMC", "Python Masterclass", 50);
        Course jmc= new Course("JMC", "Java Masterclass", 100);
        Course ctv = new Course("CTV", "Creating Game in java");

        List<Student> studentsList = Stream.generate(()-> Student.getRandomStudent(pymc, jmc, ctv))
                .limit(5000)
                .toList();


        for( String sourceCode : List.of("PYMC", "JMC", "CTV")) {
            double sum = studentsList.stream()
                    .map(s -> s.getPercentComplete(sourceCode))
                    .reduce(0D, Double::sum);

            double average = (sum/(double) studentsList.size());
            System.out.println("the average is : " + average);

            var completedStudents = studentsList.stream()
                    .filter(s -> s.getPercentComplete(sourceCode) > average * 1.25)
                    .sorted(Comparator.comparing(Student::getMonthsSinceActive))
                    .limit(10)
                    .peek(s -> s.addCourse(new Course("CC", "certificate")))
                    .toList();
//                    .forEach(System.out::println);

            completedStudents.forEach(System.out::println);
        }


    }
}
