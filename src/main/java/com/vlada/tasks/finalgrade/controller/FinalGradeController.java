package com.vlada.tasks.finalgrade.controller;

import com.vlada.tasks.finalgrade.FinalGrade;
import com.vlada.tasks.utils.Constants;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FinalGradeController {
    public void view() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You chose option 2: get the final grade");
        System.out.println("Please, chose where you want to take data from: file(F) or manual input(I)");
        String inputString = keyboard.nextLine();
        if (inputString.equals("F")) {
            BufferedReader bufferedReader = null;
            FileReader fileReader = null;
            try {
                fileReader = new FileReader("finalgrade.txt");
                bufferedReader = new BufferedReader(fileReader);
                String sCurrentLine;
                sCurrentLine = bufferedReader.readLine();
                String[] subStr;
                subStr = sCurrentLine.split(Constants.DELIMETER);
                int finalGrade = FinalGrade.finalGrade(Integer.valueOf(subStr[0]), Integer.valueOf(subStr[1]));
                System.out.println("Your final grade =" + finalGrade);
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
            }
        } else if (inputString.equals("I")) {
            System.out.println("Please, enter your grade for exam");
            int grade = keyboard.nextInt();
            System.out.println("Please, enter the number of projects you participated in");
            int numberOfProjects = keyboard.nextInt();
            int finalGrade = FinalGrade.finalGrade(grade, numberOfProjects);
            System.out.println("Your final grade = " + finalGrade);
        }
    }
}
