package com.company.calcengine;
import java.util.Scanner;
import java.util.Random;

public class Lottery {
    int randomNum[] = new int[5];
    int numberInput[] = new int[5];

    int matchesFound;

    Random lottery = new Random();

    int[] getInputNumbers(){
        Scanner inputNum = new Scanner(System.in);

        for (int i = 0; i < numberInput.length; i++){
            try {
                System.out.print("Chance #"+(i+1)+ " out 5: Enter a number from 1-10: " );
                numberInput[i] = inputNum.nextInt();
            } catch (Exception e){
                System.out.println("Invalid data entered" );
                System.exit(0);
            }
        }
        inputNum.close();

        return numberInput;
    }

    int[] getRandomNum(){
        System.out.println();
        System.out.print("Lottery random numbers generated: ");

        for (int j = 0; j < randomNum.length; j++){
            randomNum [j] = 1 + lottery.nextInt(10);

            System.out.print(randomNum[j]);
            System.out.print(" ");
        }

        return randomNum;
    }

    void displayMatch(){
        for (int i = 0; i < randomNum.length; i++){
            for (int j = 0; j < randomNum.length; j++){
                if (randomNum[i] == numberInput[j]){
                    ++matchesFound;
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println(matchesFound + " of the lottery random numbers matches the number you entered");

        if (matchesFound == 5){
            System.out.println();
            System.out.println("Congratulations you matched all 5 lottery numbers!");
        }
    }
}
