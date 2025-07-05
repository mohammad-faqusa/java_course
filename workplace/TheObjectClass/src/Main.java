public class Main extends Object {
    public static void main(String[] args) {

        Student max = new Student("Max", 21);
        System.out.println(max.toString()); // prints the hashCode number

        PrimarySchoolStuden jimmy = new PrimarySchoolStuden("jimmy" , 12, "john");
        System.out.println(jimmy.toString());
    }
}

class Student {
    private String name;
    private int age;

    Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStuden extends Student {
    private String parentName;

    public PrimarySchoolStuden(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}