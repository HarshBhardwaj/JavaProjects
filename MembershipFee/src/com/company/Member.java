package com.company;

import java.util.Scanner;

public class Member {
    //Declare variables
    int typeOfMember, monthMembership;
    double monthlyRate, totalFee, monthlyDiscount;

    Member(){
        Scanner inputData = new Scanner(System.in);

        try{
            System.out.print("Enter the Type of Membership (1- Adult, 2- Child 12 & under, 3- Student, 4- Senior Citizen): ");
            typeOfMember = inputData.nextInt();

            System.out.print("Enter the Number of Months of Membership: ");
            monthMembership = inputData.nextInt();
        } catch (Exception e){
            System.out.println("Invalid Membership Type. Member's rate, discount and total fee can not be calculated");
        }
        inputData.close();
    }

    //Get monthly fee rate based on the membership type
    double getMonthlyFeeRate(){
        switch (typeOfMember){
            case 1:
                return monthlyRate = 40;
            case 2:
                return monthlyRate = 20;
            case 3:
                return monthlyRate = 25;
            case 4:
                return monthlyRate = 30;
            default:
                return monthlyRate = 0;
        }
    }

    //Discount based on the membership months
    double getDiscount(){
        if (monthMembership >= 4 && monthMembership <= 6){
            return monthlyDiscount = 0.05;
        } else if (monthMembership >= 7 && monthMembership <= 9){
            return monthlyDiscount = 0.08;
        } else if (monthMembership >= 10){
            return monthlyDiscount = 0.10;
        } else {
            return monthlyDiscount = 0;
        }
    }

    //Calculate the total fee
    double calculateTotalFee(double rate, double discount){
        totalFee = monthMembership * rate;
        totalFee = totalFee - (totalFee * discount);

        return totalFee;
    }
}
