package dev.lpa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StringBuilder aliNotes = new StringBuilder();
        StringBuilder mohammadNotes = new StringBuilder("This is Mohammad NOtes");

        Student ali = new Student("Ali", aliNotes);
        Student mohammad = new Student("Mohammad", mohammadNotes);

        List<Student> students = new ArrayList<>(List.of(ali, mohammad));
        aliNotes.append("This is Ali's new notes,ali is the first  student ");
        List<Student> studentsFirstCopy = new ArrayList<>(students); // this is shallow copy
        List<Student> studentSecondCopy = List.copyOf(students);
        List<Student> studentsThirdCopy = Collections.unmodifiableList(students);


        studentsFirstCopy.add(new Student("Jim", new StringBuilder("added Jim Notes")));
//        studentSecondCopy.set(0, new Student("Jim", new StringBuilder("added Jim Notes")));
//        studentSecondCopy.add(new Student("Jim", new StringBuilder("added Jim Notes")));
//        studentSecondCopy.sort(Comparator.comparing(Student::getName));

        StringBuilder jimNotes = studentsFirstCopy. get(2).getStudentNotes();
        jimNotes.append(", Modified jim NOtes ");


        students.forEach(System.out::println);
        System.out.println("--------------------------");
        studentsFirstCopy.forEach(System.out::println);
        System.out.println("--------------------------");
        studentSecondCopy.forEach(System.out::println);
        System.out.println("--------------------------");
        studentsThirdCopy.forEach(System.out::println);
        System.out.println("--------------------------");


    }
}
