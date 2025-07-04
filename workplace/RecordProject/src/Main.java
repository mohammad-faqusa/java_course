public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("1234" + i,
                    switch (i) {
                        case 1 -> "Mohammad";
                        case 2 -> "Ahmad";
                        case 3 -> "Ali";
                        case 4 -> "Sharbel";
                        case 5 -> "Ehsan";
                        default -> "Anonymous";
                    },
                    "30/5/2002",
                    "Java master class");
            System.out.println(s); // print toString method if defined, else print the address of instance
        }
        Student pojoStudent = new Student("123123" , "Ann", "30/12/2000", "Java master class");
        LPAStudent recordStudent = new LPAStudent("1231232", "Bill", "18/2/2001", "Java master class");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is talking to " + recordStudent.name());
    }
}
