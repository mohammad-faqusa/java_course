package dev.lpa;

import java.util.Arrays;

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
    }
}