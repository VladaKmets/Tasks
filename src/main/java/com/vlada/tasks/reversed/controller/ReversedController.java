package com.vlada.tasks.reversed.controller;

import com.vlada.tasks.reversed.Reversed;
import com.vlada.tasks.utils.Constants;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReversedController {
    public void view() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You chose option 3: get the string reversed");
        System.out.println("Please, chose where you want to tke data from: file(F) or manual input(I)");
        String inputString = keyboard.nextLine();
        String stringToReverse = "Never wanted to leave, never wanted to leave";
        if (inputString.equals(Constants.FILE)) {
            BufferedReader bufferedReader = null;
            FileReader fileReader = null;
            try {
                fileReader = new FileReader("reversed.txt");
                bufferedReader = new BufferedReader(fileReader);
                String sCurrentLine;
                while ((sCurrentLine = bufferedReader.readLine()) != null) {
                    System.out.println(sCurrentLine);
                }
            } catch (IOException e) {
                System.out.println("Something went wrong. Contact admin.");
            } finally {
                try {
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (fileReader != null) {
                        fileReader.close();
                    }

                } catch (IOException e) {
                    System.out.println("Something went wrong. Contact admin.");
                }
                keyboard.close();
            }
        } else if (inputString.equals(Constants.INPUT)) {
            Reversed.reverseString(stringToReverse);
        }
    }
}
