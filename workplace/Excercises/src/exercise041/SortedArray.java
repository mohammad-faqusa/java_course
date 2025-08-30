package exercise041;

public class SortedArray {
    // write code here
    public static int[] getIntegers(int size) {

        java.util.Scanner s = new java.util.Scanner(System.in);
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(s.nextLine());

        }
        System.out.println(java.util.Arrays.toString(arr));
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {

        int temp = 0;
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] < arr[i]) {
                    flag = true;
                    temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        getIntegers(10);
    }
}

