public class Main {
    public static void main(String[] args) {

        int value = 3;

        switch (value) {
            case 1:
                System.out.println("the number is one");
                break;
            case 2:
                System.out.println("the number is two");
                break;
            case 3: case 4: case 5:
                System.out.println("the number is " + value);
                break;
            default:
                System.out.println("None");
        }
    }
}
