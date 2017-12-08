package com.company;
//Allow data to be inputted from the console
import java.util.Scanner;
@SuppressWarnings("resource")

public class Course extends Student{
    //Will store the student courses
    String courseNameArray[] = new String[numCourses];

    void getCourse(){
        //for loop to perform the iteration of entering the courses taken by the student
        //based on the number of courses entered
        for (int i=0; i < numCourses; i++){
            Scanner inputCourseName = new Scanner(System.in);
            inputCourseName = new Scanner(System.in);
            System.out.print("Enter the course "+ (i+1) + " name for "+ studentName+" :");
            courseNameArray[i] = inputCourseName.nextLine();
        }
    }
}
