/*
Description: This application will allow the user to enter the student information
including student ID, name, semester and number of courses taken in the semester.
It will prompt the user to enter the student's courses, the grade for each course
and credited units. The application will then calculate the student's GPA for the
semester.
Author: Harsh Vardhan
Date: 10/20/2017
 */
package com.company;

public class MainApp {

    public static void main(String[] args) {
        //Create the instance of the object (studentGPA) from the Grade Class
        GPA studentGPA = new GPA();

        //Call the object's method to get the student information
        studentGPA.getGrade();

        //Call the object's method to calculate the student's GPA and store the results into the variable
        double studentGrade = studentGPA.calculateGPA();

        //Display the results on the screen
        System.out.println();
        System.out.print("Student semester GPA: ");
        System.out.format("%.02f", studentGrade);
    }
}
