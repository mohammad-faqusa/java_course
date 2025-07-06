public class Main {
    public static void main(String[] args) {
        String textBlock = """
                Hello World!
                \u2022 This is new line
                \u2022 Another new line
                """;
        System.out.println(textBlock);

        int age = 23;

        System.out.printf("Your age is %d", age);

        int yearOfBirth = 2025 - age;

        System.out.printf("Your birth of year is : %d,%nand your age is %f", yearOfBirth, (double) age);

        for (int i = 1; i <= 10000000; i *= 10) {
            System.out.printf("Printing %10d %n", i);
        }

        String formattedString = "Your age is %d, %nand your birthdate is %d".formatted(age, yearOfBirth);
        System.out.println(formattedString);

    }
}
