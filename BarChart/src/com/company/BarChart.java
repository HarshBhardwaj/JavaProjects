package com.company;

import java.util.Scanner;

public class BarChart {
    //Declare variables
    int numStore, salesPer100;
    //Declare Array
    int storeArray[] = new int[5];

    BarChart(){
        //Initialize the variable
        numStore = 1;

        //Prompt the user to input monthly sales for each store
        Scanner inputSales = new Scanner(System.in);

        //Used do while loop to get each stores data
        do {
            System.out.print("Store "+ numStore + " Enter montly sales: $");
            //Store the value into the array
            storeArray[numStore-1]=inputSales.nextInt();

            //Increment the store count
            ++numStore;
        } while (numStore <= 5);
        //Close the input scanner object
        inputSales.close();
    }

    void displayChart(){
        //Initialize the variable again
        numStore = 1;

        //Used do while loop to display the asterisk chart
        do {
            //Calculate the sales per $100
            salesPer100 = storeArray[numStore-1]/100;

            System.out.print("Store "+ numStore + ": ");

            for (int i=0; i < salesPer100; i++){
                System.out.print("*");
            }
            System.out.println();
            ++ numStore;
        } while (numStore <=5);
    }
}
