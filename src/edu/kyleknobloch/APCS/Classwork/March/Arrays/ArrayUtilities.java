package edu.kyleknobloch.APCS.Classwork.March.Arrays;

import java.util.ArrayList;

/**
 *
 */
public class ArrayUtilities {

    private int[] array;

    public ArrayUtilities(String filepath) {
        ArrayListUtilities ALU = new ArrayListUtilities(filepath);

        fillFromArrayList(ALU.getArray());
    }


    /**
     * Fill the array with the ArrayList
     * @param arrayList the ArrayList that we are filling from.
     */
    public void fillFromArrayList(ArrayList<Integer> arrayList) {

        array = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }

    }


    /**
     * Find a element in the array
     * @param element - element to look for
     * @return the index of that element
     */
    public int search(int element) {

        int left = 0, right = array.length -1, middle, index = -1;

        while (left <= right) {
            middle = (left + right) /2;

            if (element > array[middle])
                left = middle + 1;
            else if (element < array[middle])
                right = middle -1;
            else {
                index = middle;
                break;
            }
        }

        return index;
    }


    /**
     * print array list with System.out.print();
     */
    public void sysLinePrintArray() {
        System.out.print("\n");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ": " + array[i]);
        }
    }
}