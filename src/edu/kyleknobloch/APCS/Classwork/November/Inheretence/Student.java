package edu.kyleknobloch.APCS.Classwork.November.Inheretence;

import java.util.Random;

/**
 * Student Class
 */
public class Student {


    private final int CURRENT_YEAR = 2016;

    private String firstName;
    private String lastName;
    private String middleInitial;
    private String address;
    private String phoneNumber;
    private String contactNumbers;
    private int studentID;
    private int YoG;
    private int absences;


    public Student (String firstName, String lastName, String middleInitiel, String addres, String phoneNumber, String contactNumbers) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = middleInitiel;
        this.address = addres;
        this.phoneNumber = phoneNumber;
        this.contactNumbers = contactNumbers;
        absences = 0;

        studentID = setStudentID();
        YoG = CURRENT_YEAR + 4;

    }

    public Student (String firstName, int absences) {
        this.firstName = firstName;
        this.absences = absences;

        this.lastName = "null";
        this.middleInitial = "null";
        this.address = "null";
        this.phoneNumber = "null";
        this.contactNumbers = "null";
        studentID = setStudentID();
        YoG = CURRENT_YEAR + 4;
    }


    /**
     * toString displays all the information that we have for the student.
     * @return toString message
     */
    @Override
    public String toString () {
        return "Student information: " +
                "\nFull Name: " + getFirstName() + " " + getMiddleInitial() + " " + getLastName() +
                "\nAddress: " + getAddress() +
                "\nPhone Number: " + getPhoneNumber() +
                "\nContact Numbers: " + getContactNumbers() +
                "\nID: " + getStudentID() +
                "\nYoG: " + getYoG() +
                "\nAbsences: " + getAbsences() + " \n";
    }

    /**
     * get methods
     */
    public int getStudentID() {
        return studentID;
    }

    public int getAbsences() {
        return absences;
    }

    public int getYoG() {
        return YoG;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNumbers() {
        return contactNumbers;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * set methods
     *
     * These methods can me changed if needed.
     */
    public void setYoG(int yoG) {
        YoG = yoG;
    }

    private int setStudentID() {
        Random r = new Random();

        return r.nextInt(999999999) + 1;
    }

}
