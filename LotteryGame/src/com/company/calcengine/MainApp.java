/*
Description: This application simulates a lottery. The application should have an
array of five integers and should generate a random number in the range 1 through 10
for each element in the array. The array is permitted to contain a duplicate values.
The user should then enter five digits, which the application will compare to the
numbers in the array. The application should display how many of the digits matched.
If all of the digits match, display a message to the user - "Congratulations you
matched all 5 lottery numbers !".
Author: Harsh Vardhan
Date: November 10, 2017
 */

package com.company.calcengine;

public class MainApp {

    public static void main(String[] args) {
        Lottery game = new Lottery();

        game.getInputNumbers();
        game.getRandomNum();
        game.displayMatch();
    }
}
