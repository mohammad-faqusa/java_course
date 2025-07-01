public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
            System.out.println("10,000 at " + i + "% interest = " + calculateInterset(10000, i ));
        }
        for(double i = 7.5; i <= 10; i+=0.25){
            System.out.println(i);

            System.out.println("10,000 at " + i + "% interest = " + calculateInterset(10000, i ));
        }
    }

    public static double calculateInterset(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
