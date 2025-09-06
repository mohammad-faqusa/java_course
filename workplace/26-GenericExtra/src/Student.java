public class Student implements  QueryItem, Comparable<Student>{

    private static int LAST_ID = 10_000;
    private String name;
    private String source;
    private int yearStarted;
    private int studentId ;

    private static String[] firstNames = {"John", "Jane", "Jill", "Jack"};
    private static String[] courses = {"Math", "Science", "English", "History", "Python"};

    public Student() {
        name = firstNames[(int)(Math.random() * firstNames.length)];
        source = courses[(int)(Math.random() * courses.length)];
        yearStarted = (int)(Math.random() * 20) + 2000;
        studentId = LAST_ID++;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String fieldValue) {
        fieldName = fieldName.toUpperCase();
        return switch (fieldName) {
            case "NAME" -> name.equals(fieldValue);
            case "SOURCE" -> source.equals(fieldValue);
            default -> false;
        };
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d, id : %d", name, source, yearStarted, studentId);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(studentId, o.getStudentId());
    }


}
//1. create GenericExtra project
//2. create class student
//   * fields :
//        * string name
//     * string source
//     * int yearStarted
//     * protected static Random random = new Random
//        * private static String [] firstNames = {...}
//        * private static String [] courses = {...}
//        * constructor
//     * ()
//             * name = random name
//       * course = random course
//       * yearStarted = random year
//     * toString
//       * name, course , year started
//     * methods :
//        * getYearStarted
