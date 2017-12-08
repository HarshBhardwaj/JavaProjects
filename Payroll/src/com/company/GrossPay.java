package com.company;

import java.util.Scanner;

public class GrossPay {
    //Declare your variables
    double hoursWorked;
    //Static variables
    final static double HOURL_PAY_RATE=14;
    final static int MAX_EMPLOYEES=5;
    //Array
    double employeePayArray[] = new double[MAX_EMPLOYEES];

    GrossPay(){
        Scanner inputEmpHours = new Scanner(System.in);

        //Uso loop to iterate to get input hours worked for each employee
        for (int i = 0; i < MAX_EMPLOYEES; i++){
            System.out.print("Enter hours worked for employee " + (i+1)+": ");
            hoursWorked = inputEmpHours.nextDouble();

            //Calculate gross pay and store the employees pay in array
            employeePayArray[i] = hoursWorked * HOURL_PAY_RATE;
        }

        //Close input scanner
        inputEmpHours.close();
    }

    void displayPayroll(){
        System.out.println();

        //Loop to perform the iteration of displaying employee's gross pay
        for (int i=0; i < MAX_EMPLOYEES; i++){
            System.out.print("Employee "+ (i+1) + "earned: ");
            System.out.format("$%.2f", employeePayArray[i]);
            System.out.println();
        }
    }
}
