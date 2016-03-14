package edu.kyleknobloch.APCS.Classwork.March.Arrays;

import edu.kyleknobloch.APCS.Classwork.November.Inheretence.Student;

import java.util.ArrayList;

public class SeatingChart {


    public static void main (String args[]) {

        ArrayList<Student> array = new ArrayList<>();

        array.add(new Student("Kyle", 4));
        array.add(new Student("Kdyle", 4));
        array.add(new Student("Kdyle", 3));
        array.add(new Student("Kdaayle", 0));
        array.add(new Student("Kvyle", 1));
        array.add(new Student("Kcsyle", 2));
        array.add(new Student("Kychsle", 5));
        array.add(new Student("Kycfsle", 6));
        array.add(new Student("Kycgsle", 7));
        array.add(new Student("Kcsyle", 8));
        array.add(new Student("Kvdyle", 9));
        array.add(new Student("Kgggyle", 0));

        SeatingChart sc = new SeatingChart(array, 3, 4);

        System.out.print(sc.removeAbsentStudent(4));
    }

    private Student[][] seats;

    public SeatingChart(ArrayList<Student> studentList, int rows, int cols) {
        int index = 0;
        seats = new Student[rows][cols];

        for (int c = 0; c < cols; c++) {
            for (int r = 0; r < rows; r++) {
                if (index > studentList.size() -1 )
                    seats[c][r] = null; //we no longer have students
                else
                    seats[c][r] = studentList.get(index);

                index++;
            }
        }

        if (index < studentList.size())
            System.out.println("You might not of included enough seats. ");
        else if (index >= studentList.size() -1)
            System.out.println("There was too many seats, " + (index - (studentList.size() -1 )) + " empty seat(s) was included. ");
    }

    public int removeAbsentStudent(int threshold) {

        int count = 0;

        if (threshold < 0) {   //check
            System.out.println("Did not meet precondition.");
            return -1;
        }

        for (int c = 0; c < seats.length -1; c++) {
            for (int r = 0; r < seats[c].length -1; r++) {
                if (seats[c][r] != null)
                    if (seats[c][r].getAbsences() > threshold)
                        seats[c][r] = null;
                count++;
            }
        }

        return count;
    }
}