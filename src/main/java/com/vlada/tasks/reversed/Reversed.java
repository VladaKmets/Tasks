package com.vlada.tasks.reversed;

import com.vlada.tasks.utils.Constants;

import java.util.Scanner;

public class Reversed {
    public static void main(String[] args) {
        String stringToReverse = "Never wanted to leave, never wanted to leave";
        reverseString(stringToReverse);
    }

    public static void reverseString(String string) {
        Scanner keyboard = new Scanner(System.in);
        String stringToReverse = keyboard.nextLine();
        System.out.println("Please, enter a string to reverse");
        String[] subStrings;
        subStrings = stringToReverse.split(Constants.DELIMETER);
        for (int i = subStrings.length - 1; i >= 0; i--) {
            System.out.print(subStrings[i] + Constants.DELIMETER);
        }
        keyboard.close();
    }
}
