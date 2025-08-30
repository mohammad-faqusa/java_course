package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {

    public static void main(String[] args) {
        int[] myIntArray = getRandomArray(10);

        System.out.println(Arrays.toString(myIntArray));
        sortArray(myIntArray);
        System.out.println(Arrays.toString(myIntArray));
        
    }

    private static int[] getRandomArray(int len) {

        int [] newArray = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            newArray[i] = random.nextInt(100);
        }

        return newArray;
    }

    private static int[] sortArray(int[] array){

        boolean flag = true;
        int temp = 0;
        while(flag) {
            flag = false;
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] < array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
        }

        return array;
    }
}
