import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            students.add(new Student());
        }
        printList(students);

        ArrayList<Student> lpaStudents = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            lpaStudents.add(new LPAStudent());
        }
        printList(lpaStudents);
    }

    public static void printList(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}


//5. in main method
//   * create a list of LPA students
//   * print list