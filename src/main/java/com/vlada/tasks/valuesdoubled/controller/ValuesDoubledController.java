package com.vlada.tasks.valuesdoubled.controller;

import com.vlada.tasks.utils.Constants;
import com.vlada.tasks.valuesdoubled.ValuesDoubled;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ValuesDoubledController {
    public void view() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You chose option 6: get all the values of elements of an array doubled");
        System.out.println("Please, chose where you want to tke data from: file(F) or manual input(I)");
        String inputString = keyboard.nextLine();
        Integer[] integers = {3, 2, 5, 8, 1, 4};
        if (inputString.equals(Constants.FILE)) {
            BufferedReader bufferedReader = null;
            FileReader fileReader = null;
            try {
                fileReader = new FileReader("valuesdoubled.txt");
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
            ValuesDoubled.calculate(integers);
        }

    }
}
