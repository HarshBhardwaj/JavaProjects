/*
Description: This application allows the user to enter each month's amount of
rainfall (inches) and calculates the total and average rainfall for the year
The total and average rainfall is displayed on the screen
Author: Harsh Vardhan
Date: Oct 6, 2017
 */
package com.company;

public class MainApp {

    public static void main(String[] args) {
        //Instance of rainfall object from the statistics class
        Statistics rainfall = new Statistics();

        //Get the user data and store in variable
        double rainTotal = rainfall.getRainFallStats();

        //Calculate the average rainfall and store the result in variable
        double avgYearlyRain = rainfall.calcAverageRainFall(rainTotal);

        //Display the result
        System.out.println();
        System.out.print("Total Yearly Rainfall: ");
        System.out.format("%.2f", rainTotal);
        System.out.println();
        System.out.print("Average Yearly Rainfall: ");
        System.out.format("%.2f", avgYearlyRain);
    }
}
