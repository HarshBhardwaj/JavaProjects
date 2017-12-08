package com.company;

import java.util.Scanner;

@SuppressWarnings("resource")

public class Grade extends Course{
    //Arrays that will store the data
    String courseGrade[] = new String[numCourses];
    int courseCreditHours[] = new int[numCourses];

    void getGrade(){
        this.getCourse();

        Scanner inputGrade = new Scanner(System.in);
        Scanner inputCreditHours = new Scanner(System.in);

        for (int i=0; i < numCourses; i++){
            System.out.println();

            System.out.print("Enter the letter grade for course "+ this.courseNameArray[i]+ " :");
            courseGrade[i] = inputGrade.nextLine();

            System.out.print("Enter the credit unit hours for course "+ this.courseNameArray[i]+ " :");
            courseCreditHours[i] = inputCreditHours.nextInt();
        }

        inputGrade.close();
        inputCreditHours.close();
    }
}
