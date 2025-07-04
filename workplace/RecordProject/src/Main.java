public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Student s = new Student("1234" + i,
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
    }
}
