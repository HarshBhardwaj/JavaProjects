package com.company;

import java.util.Scanner;

public class Statistics {
    //Declare variables
    double totalRainFall=0, avgRainFall=0;
    //Array to store monthly rainfall data
    double statsArray[] = new double[12];
    //Array to store the months
    String monthArray[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    double getRainFallStats(){
        Scanner inputStats = new Scanner(System.in);

        //Enter the month's rainfall statistics
        for (int i=0; i < statsArray.length; i++){
            System.out.print("Enter rainfall data for "+ monthArray[i]+ " (inches):");

            //Store user input into the array location
            statsArray[i]=inputStats.nextDouble();

            //Running total of the monthly rain fall
            totalRainFall = statsArray[i]+totalRainFall;
        }
        //Close the Scanner
        inputStats.close();
        //return the result value
        return totalRainFall;
    }

    //Calculate the average yearly rainfall
    double calcAverageRainFall(double total){
        return avgRainFall = total/12;
    }
}
