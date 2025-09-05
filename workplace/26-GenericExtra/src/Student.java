public class Student {

    private String name;
    private String source;
    private int yearStarted;

    private static String[] firstNames = {"John", "Jane", "Jill", "Jack"};
    private static String[] courses = {"Math", "Science", "English", "History"};

    public Student() {
        name = firstNames[(int)(Math.random() * firstNames.length)];
        source = courses[(int)(Math.random() * courses.length)];
        yearStarted = (int)(Math.random() * 20) + 2000;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d", name, source, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
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
