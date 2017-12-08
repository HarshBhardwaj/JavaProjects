package com.company;
//Allow data to be inputted from the console
import java.util.Scanner;
@SuppressWarnings("resource")

public class Student {
    //Local variables to be accessed by the subclass
    public String studentID, studentName, semester;
    //Public variable to be accessed by Course subclass
    public Integer numCourses;

    //Prompt user to enter data
    Student(){
        Scanner inputStudentID = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        studentID = inputStudentID.nextLine();

        Scanner inputStudentName = new Scanner(System.in);
        System.out.print("Enter student name: ");
        studentName = inputStudentName.nextLine();

        Scanner inputSemester = new Scanner(System.in);
        System.out.print("Enter the semester: ");
        semester = inputSemester.nextLine();

        Scanner inputNumCourses = new Scanner(System.in);
        System.out.print("Enter number of courses taken by student in "+ semester + ":");
        numCourses = inputNumCourses.nextInt();
        System.out.println();
    }
}
