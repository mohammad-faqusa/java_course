import java.util.Arrays;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Integer[] intArr = new Integer[]{1, 2 , 8 , 10 , 12 , 15 , 13};

        Arrays.sort(intArr);

        System.out.println(Arrays.toString(intArr));

        String[] strArr = new String[]{"Banana" , "Apple" , "Avocado" , "Orange" , "Kiwi"};

        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        Student[] stuArr = new Student[]{new Student("Tom" , 18) , new Student("Jerry" , 19) , new Student("Jack" , 17)};

//        Arrays.sort(stuArr);
//        System.out.println(Arrays.toString(stuArr));

        Comparator<Student> gpaComparator = new StudentGPAComparator();
        Arrays.sort(stuArr , gpaComparator);
    }
}

class StudentGPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

class Student implements Comparable{

    private String name;
    private Integer age;

    public Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    @Override
    public int compareTo(Object o) {

        return age.compareTo(((Student)o).age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}