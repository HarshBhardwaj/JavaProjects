/*
Description: This program prompts the user to enter the daily sales amount
from Monday (day 1) to Sunday (day 7). The total weekly sales amount is then
calculated and displayed on the console.
Author: Harsh Vardhan
Date: Oct 4, 2017
 */
package com.company;

public class MainApp {

    //Main method is the starting point of the program
    public static void main(String[] args) {
        //Create instance of the weeklyAmt object from Sales class
        Sales weeklyAmt = new Sales();

        //Call the object's method to prompt user input the daily sales amount,
        //accumulate the daily sales and calculate the total weekly sales
        double totalAmt = weeklyAmt.totalAmount();

        //Print out the total weekly sales amount
        System.out.print("Total Weekly Sales Amount: ");
        System.out.format("$%,.2f", totalAmt);
    }
}
