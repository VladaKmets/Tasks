package com.vlada.tasks.alarm.controller;

import com.vlada.tasks.alarm.Alarm;
import com.vlada.tasks.utils.Constants;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class AlarmController {
    public void view() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You chose option 1: set an alarm");
        System.out.println("Please, chose where you want to take data from: file(F) or manual input(I)");
        String inputString = keyboard.nextLine();
        if (inputString.equals("F")) {
            BufferedReader bufferedReader = null;
            FileReader fileReader = null;
            try {
                fileReader = new FileReader("alarm.txt");
                bufferedReader = new BufferedReader(fileReader);
                String sCurrentLine;
                sCurrentLine = bufferedReader.readLine();
                String[] substring = sCurrentLine.split(Constants.DELIMETER);
                Alarm.setAlarm(Boolean.valueOf(substring[0]), Boolean.valueOf(substring[1]));
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
            System.out.println("Please, enter the status of 'employed' parameter: true or false");
            boolean employed = keyboard.nextBoolean();
            System.out.println("Please, enter the status of 'vacation' parameter: true or false");
            boolean vacation = keyboard.nextBoolean();
            Alarm.setAlarm(employed, vacation);
        }
    }
}
