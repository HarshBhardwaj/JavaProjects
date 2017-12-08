/*
Description: This application prompts the user to enter the monthly sales for 5 department
stores. The program then displays a simple bar graph comparing each store's sales. Each
bar in the graph displays a row of asterisks (*) which represents $100 in sales
Author: Harsh Vardhan
Date: 10/11/2017
 */
package com.company;

public class MainApp {

    public static void main(String[] args) {
	// write your code here
        BarChart store = new BarChart();

        //Display the header
        System.out.println();
        System.out.println("Store's Performance Bar Chart");

        //Display the Bar Chart
        store.displayChart();
    }
}
