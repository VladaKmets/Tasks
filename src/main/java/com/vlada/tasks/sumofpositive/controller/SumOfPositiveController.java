package com.vlada.tasks.sumofpositive.controller;

import com.vlada.tasks.sumofpositive.SumOfPositive;
import com.vlada.tasks.utils.Constants;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SumOfPositiveController {
    public void view() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You chose option 5: get the sum of positive elements of array");
        System.out.println("Please, chose where you want to take data from: file(F) or manual input(I)");
        String inputString = keyboard.nextLine();
        if (inputString.equals(Constants.FILE)) {
            BufferedReader bufferedReader = null;
            FileReader fileReader = null;
            try {
                fileReader = new FileReader("sumofpositive.txt");
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
            System.out.println("Please, enter the size of an array");
            Integer size = keyboard.nextInt();
            System.out.println("Please, enter" + size + " elements for an array");
            Integer element = keyboard.nextInt();
            Integer[] elements = new Integer[size];
            for (int i = 0; i < elements.length; i++) {
                elements[i] = element;
            }
            SumOfPositive.getSumOfPositive(elements);
            keyboard.close();
        }
    }
}
