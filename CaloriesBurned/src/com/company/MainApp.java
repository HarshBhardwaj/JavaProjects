/*
Description: This application uses an array and for loop to accomplish the following:
1. Get the calories burned for each day of the week (Monday to Sunday)
2. Compute the total calories burned using a running total
3. Calculate the average calories burned
4. Get the highest and lowest calories burned during the week.
Author: Harsh Vardhan
Date: 10/14/2017
 */
package com.company;

public class MainApp {

    public static void main(String[] args) {
        //Instance of the object (person) from the Calories class
        Calories person = new Calories();

        //Call the object's method and store returned result into the variable
        int totCalBurned = person.calcTotalCalories();

        //Call the object's method and store returned result into the variable.
        // Pass the totalCalBurned value to object's method
        int avgCalBurned = person.calcWeeklyAvg(totCalBurned);

        //Call the object's method and store returned results into the variable.
        // Pass the array to object's method.
        int highCalBurned = person.getHighestCal(person.caloriesArray);
        int lowestCalBurned = person.getLowestcal(person.caloriesArray);

        //Display the results on the console
        System.out.println();
        System.out.println("Total calories burned: "+ totCalBurned);
        System.out.println("Average calories burned: "+ avgCalBurned);
        System.out.println("Highest calories burned: "+ highCalBurned);
        System.out.println("Lowest calories burned: "+ lowestCalBurned);
    }
}
