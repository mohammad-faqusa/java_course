public class StringMethods {
    public static void main(String[] args) {

        String birthDate = "30/05/2002";
        int startIndex = birthDate.indexOf("2002");
        System.out.println("Starting index is " + startIndex);
        String birthYear = birthDate.substring(startIndex);
        System.out.println("Birth year is " + birthYear);

        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "30", "05", "2002");
        System.out.println("New date is " + newDate);

        newDate = "25";
        System.out.println("New date is " + newDate);
        newDate  = newDate.concat("/03");
        System.out.println("New date is " + newDate);
        newDate = newDate.concat("/2002");
        System.out.println("New date is " + newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "000"));

        System.out.println("1234\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        String blockString = """
                This is block string
                here is new line
                1234
                1234
                this is the lastLine""".indent(8);
        System.out.println("This is block string is \n" + blockString);
    }
}
