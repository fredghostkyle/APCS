package edu.kyleknobloch.APCS.Classwork.March;

import java.util.Arrays;
import java.util.Random;

public class BogoSort{

    private static final Random generator = new Random();

    public static void bogoSort(int[] array)  {
        while (!isSorted(array)) {
            for (int i = 0; i < array.length; i++){
                System.out.println("Searching:  " + Arrays.toString(array));
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    //
                }
                int randomPosition = generator.nextInt(array.length);
                int temp = array[i];
                array[i] = array[randomPosition];
                array[randomPosition] = temp;
            }
        }
    }

    private static boolean isSorted(int[] array)  {
        for (int i = 1; i < array.length; i++){
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] array = {5,3,0,2,4,1,0,5,2,3,1,4};
        System.out.println("Before: " + Arrays.toString(array));
        bogoSort(array);
        System.out.println("After:  " + Arrays.toString(array));
    }
}
