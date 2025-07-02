public class Main {
    public static void main(String[] args) {
        int number  = 10;
        for (int i = 2; i < number; i++) {
            System.out.println(i + " is " + (isPrime(i) ? "prime" : "not prime"));
        }
    }

    public static boolean isPrime(int number) {

        if(number <= 2){
            return number == 2;
        }

        for (int devisor = 2; devisor < number; devisor++){
            if (number % devisor == 0) {
                return false;
            }
        }

        return true ;
    }
}
