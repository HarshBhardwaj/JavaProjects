/*
Description: This application uses an array and the for loop to store and display
the gross pay of five employee. The user inputs the hours worked for each
employee. The employee's gross pay is calculated based on the formula "hours
worked * hourly rate" and then displayed on the console.
Author: Harsh Vardhan
Date: Oct 06, 2017
 */
package com.company;
public class MainApp {

    public static void main(String[] args) {
        //Instance of GrossPay class
        GrossPay employee = new GrossPay();

        //Display employee's gross pay
        employee.displayPayroll();
    }
}
