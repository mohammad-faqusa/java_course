public class ShareDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 43));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99)
            return false;

        int temp1 = num1;

        while (temp1 != 0) {
            int b = temp1 % 10;
            int temp2 = num2; // reset here
            while (temp2 != 0) {
                int a = temp2 % 10;
                System.out.println("temp 1 = " + b );
                System.out.println("temp 2 = " + a );
                if (a == b)
                    return true;
                temp2 /= 10;
            }
            temp1 /= 10;
        }
        return false;
    }

}
