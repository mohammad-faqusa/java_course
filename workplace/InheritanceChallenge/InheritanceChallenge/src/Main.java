public class Main {

    public static void main(String [] args) {
        Employee tim = new Employee("Mohammad", "30/05/2002",  "1/1/2026");
        System.out.println(tim.toString());
        System.out.println("Tim age  = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        Employee joe = new Employee("Joe", "11/11/2000", "1/1/2027");
        System.out.println(joe);

    }
}
