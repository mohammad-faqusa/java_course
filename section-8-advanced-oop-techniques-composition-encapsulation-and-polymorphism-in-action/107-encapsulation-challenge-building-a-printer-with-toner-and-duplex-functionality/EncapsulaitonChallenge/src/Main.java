public class Main {

    public static void main (String [] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count : " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);

        System.out.printf("Job current pages %d, total amount printed : %d", pagesPrinted,
                printer.getPagesPrinted());
    }
}
