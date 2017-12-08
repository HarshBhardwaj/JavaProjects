//import the Scanner library class from Java Util library to get users input
package com.company;

import java.util.Scanner;

public class Sales {
    //declare variables that will hold your output values
    double salesDailyAmount, salesTotal;
    //declare variable and initiate it to get the loop started
    int day = 1;

    //This method will take users value for daily sales amount and calculate weekly total sales amount
    //This is a public method
    double totalAmount(){
        //This scanner object will take users input of daily sales amount and store in inputAmt variable
        Scanner inputAmt = new Scanner(System.in);

        //This will prompt the user to input daily sales and store runtime total sales amount
        while (day <= 7){
            //Ask the user to input daily sales for each day of the week
            System.out.print("Day " + day + " Enter daily sales amount: $");
            salesDailyAmount = inputAmt.nextDouble();

            //Add the running sales total
            salesTotal = salesDailyAmount + salesTotal;

            //Increment the day of the week post users input
            day++;
        }
        //Close the scanner to end user input for this method
        inputAmt.close();

        //Return sales total
        return salesTotal;
    }
}
