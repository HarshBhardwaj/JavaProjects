package com.company;

public class GPA extends Grade {
    //Local variable
    double gpa, coursePoints, totalPoints, totalCreditHours;
    //Array that will store the data
    int gradePoints[] = new int[numCourses];

    double calculateGPA(){
        for (int i = 0; i < numCourses; i++){
            //Switch-case block to determine the equivalent grade points from the course letter grade
            switch (courseGrade[i].toUpperCase()){
                case "A":
                    gradePoints[i] = 4;
                    break;
                case "B":
                    gradePoints[i] = 3;
                    break;
                case "C":
                    gradePoints[i] = 2;
                    break;
                case "D":
                    gradePoints[i] = 1;
                    break;
                default:
                    gradePoints[i] = 0;
            }

            coursePoints = courseCreditHours[i]*gradePoints[i];
            totalPoints = coursePoints + totalPoints;
            totalCreditHours = courseCreditHours[i]+totalCreditHours;
        }
        //Calculate the student's semester GPA
        gpa = totalPoints/totalCreditHours;
        return gpa;
    }
}
