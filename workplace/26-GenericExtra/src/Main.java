import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student());
        }
        printMoreList(students);

        students.add(new LPAStudent());

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lpaStudents.add(new LPAStudent());
        }

        printMoreList(lpaStudents);

        testList(new ArrayList<String>(List.of("Hello", "World", "Mohammad" , "Faqusa")));
        testList(new ArrayList<Integer>(List.of(1, 2, 3, 4)));

        var studentsQuery = new QueryList<>(students);
        var resultQuery = studentsQuery.getItems("name" , "John");
        System.out.println("here is the queried list : ");
        printMoreList(resultQuery);
    }

    public static void printMoreList(List<? extends Student>students) {
        Student last = students.get(students.size()-1);
//        students.set(0, last);

        for(var s : students) {
            System.out.println("Year started : " + s.getYearStarted() + " Student : " + s);
        }
    }

    public static void testList(List<?> list) {

        for(var element : list) {
            if(element instanceof String str) {
                System.out.println(str.toUpperCase());
            }
            if(element instanceof Integer intVal) {
                System.out.println(intVal.floatValue());
            }
        }
    }


}