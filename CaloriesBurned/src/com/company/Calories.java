package com.company;
import java.util.Scanner;

public class Calories {
    //Declare variables
    int totalCal, avgCal, highestCal, lowestcal;
    //Declare arrays and initialize
    int caloriesArray[] = new int[7];
    String dayOfWeek[] = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    int calcTotalCalories(){
        Scanner inputCalories = new Scanner(System.in);

        try{
            for (int i=0; i < caloriesArray.length; i++){
                System.out.print("Enter the number of calories burned on " + dayOfWeek[i]+ " :");
                caloriesArray[i]=inputCalories.nextInt();

                totalCal = totalCal + caloriesArray[i];
            }
        } catch (Exception e){
            System.out.println("Invalid data entered.");
        }

        inputCalories.close();
        return totalCal;
    }

    int calcWeeklyAvg(int totalBurned){
        avgCal = totalBurned/7;
        return avgCal;
    }

    int getHighestCal(int calArray[]){
        for (int i=0; i < calArray.length; i++){
            if (calArray[i] > highestCal){
                highestCal = calArray[i];
            }
        }
        return highestCal;
    }
    int getLowestcal(int calArray[]){
        lowestcal = caloriesArray[0];

        for (int i=0; i<calArray.length; i++){
            if (calArray[i] < lowestcal){
                lowestcal = calArray[i];
            }
        }
        return lowestcal;
    }
}
