public class SumNumbers {
    public static void main(String [] args) {
        int count = 0;
        int sum = 0;
        for (int i = 0 ; i <= 1000 ; i++ ){
            if(i % 3 == 0 || i % 5 == 0){
                count++;
                sum += i ;
            }

            if(count >= 5)
                break;

        }

        System.out.println("the counted numbers are : " + count);
        System.out.println("the sum of numbers is : " + sum);
    }
}
