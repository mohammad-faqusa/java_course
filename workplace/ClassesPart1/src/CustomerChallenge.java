public class CustomerChallenge {
    public static void main(String [] args) {
        Customer mohammad = new Customer("Mohammad", 1000, "mohammad@gmail.com");
        System.out.println(mohammad.toString());

        Customer anonymous = new Customer();
        System.out.println(anonymous.toString());

        Customer Ahmad = new Customer("Ahmad" , "Ahmad@gmail.com");
        System.out.println(Ahmad.toString());

        

        new Customer(); // can't access it later, because has no reference




    }
}
