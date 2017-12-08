/*
Description: This is a Health Club Membership Fee Calculator Application
This program calculates a Member's Monthly Rate, Member's Discount
and Member's Total Fee. This application performs error handling when
invalid data is inputed. Switch Case block is used to get the member's
monthly rate and the If-Then-Else-If statements to get the member's discount.
Author: Harsh Vardhan
Date: 10/13/2017
 */

package com.company;

public class MainApp {

    public static void main(String[] args) {
        //Instance of the object (fee) from the member class
        Member fee = new Member();

        //Call the object's method and store returned results into the variables
        double rate = fee.getMonthlyFeeRate();
        double discount = fee.getDiscount();

        //Call the object's method and store returned result into the variable.
        //Pass the date and discount value to object's method
        double totalFree = fee.calculateTotalFee(rate, discount);

        //Display the returned results on the console
        System.out.print("Member's Monthly Rate: ");
        System.out.format("$%,.2f", rate);
        System.out.println();

        System.out.print("Member's Discount: ");
        System.out.format("%,.0f", discount*100);
        System.out.print("%");
        System.out.println();

        System.out.print("Member's Total Fee with Discount: ");
        System.out.format("$%, .2f", totalFree);
        System.out.println();
    }
}
