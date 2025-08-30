package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
//        myIntArray[4] = "1"; // compiler error

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);// call the third element

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        int arrayLength = firstTen.length;
        System.out.println("length of the array is : " + arrayLength);
//        System.out.println("last = " + firstTen[arrayLength]); // exception out of bound
        System.out.println("last = " + firstTen[arrayLength - 1]); // exception out of bound

        int[] newArray;
        newArray = new int[]{1,2,4,7,3,5,6};
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        newArray = new int[5];
        for(int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " "); // print zeros
        }

        int [] newArrayEnhanced;
        newArrayEnhanced = new int[5];
        for(int i : newArrayEnhanced){
            System.out.print( i + " " ); // print zeros
        }

        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if(objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array");
            System.out.println(newArray.getClass().getName());
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;
        System.out.println(Arrays.toString(objectArray));

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] firstArrayCopy = Arrays.copyOf(firstArray, 5);
        System.out.println(Arrays.toString(firstArrayCopy));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 3);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        String[] sArray = {"able", "Java", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "Ralph") >= 0){
            System.out.println("Ralph is in the array");
        }

        int[] s1 = {1,2,3,4,5};
//        int[] s2 = {1,2,3,4,5};
        int [] s2 = {1,2,3,4,3};
//        int[] s2 = {1,2,3,4,5,0};

        if(Arrays.equals(s1, s2)){
            System.out.println("s1 and s2 are equal");
        } else {
            System.out.println("s1 and s2 are not equal");
        }
    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];


        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}