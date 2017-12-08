/*
Description: Create an application that allows the user to enter the number of rooms
to be painted and the price of the paint per gallon. Assume for every 115 square feet
of wall space that one gallon of paint and eight hours of labor are required. The
application should display the following information 1) Number of gallons of painted
requires, 2) Hours of labor required, 3) Cost of the paint, 4) Labor charges and
5) Total cost of the paint job.
Author: Harsh Vardhan
Date: 10/21/2017
 */
package com.company;
import residentialPaintJobs.*;

public class MainApp {

    public static void main(String[] args) {
        Cost paintJob = new Cost();

        System.out.println();
        System.out.print("Number of Gallons of Paint Required: ");
        System.out.format("%.2f", paintJob.totalGallonsReq);

        System.out.println();
        System.out.print("Hours of Labor Required: ");
        System.out.format("%.2f", paintJob.totalHoursLaborReq);

        System.out.println();
        System.out.print("Cost of the Paint: ");
        System.out.format("%.2f", paintJob.costOfPaint);

        System.out.println();
        System.out.print("Labor Cost: ");
        System.out.format("%.2f", paintJob.laborCost);

        System.out.println();
        System.out.print("Total Cost: ");
        System.out.format("%.2f", paintJob.totalCost);
    }
}
