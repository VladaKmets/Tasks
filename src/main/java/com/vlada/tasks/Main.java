package com.vlada.tasks;

import com.vlada.tasks.alarm.controller.AlarmController;
import com.vlada.tasks.enoughSpace.controller.EnoughSpaceController;
import com.vlada.tasks.filework.controller.FileWorkController;
import com.vlada.tasks.finalgrade.controller.FinalGradeController;
import com.vlada.tasks.insertionSort.controller.InsertionSortCotroller;
import com.vlada.tasks.makeEqual.controller.MakeEqualController;
import com.vlada.tasks.monkeycount.controller.MonkeyCountController;
import com.vlada.tasks.remove.controller.RemovePartsController;
import com.vlada.tasks.reversed.controller.ReversedController;
import com.vlada.tasks.rotation.controller.RotationController;
import com.vlada.tasks.stringtointeger.controller.StringToIntegerController;
import com.vlada.tasks.sumofpositive.controller.SumOfPositiveController;
import com.vlada.tasks.valuesdoubled.controller.ValuesDoubledController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("Hello! Please, chose the needed option:");
            System.out.println("To set an alarm, press 1;");
            System.out.println("To get the final grade based on your exams and projects, press 2;");
            System.out.println("To get the given string reversed, press 3;");
            System.out.println("To rotate the massive of integers, press 4;");
            System.out.println("To get the sum of all positive elements of the massive of integers, press 5");
            System.out.println("To get all the values in the massive of integers doubled, press 6");
            System.out.println("To read the lyrics of the best Florence and the machine's song ever from the file, press 7");
            System.out.println("To convert String to Integer, press 8");
            System.out.println("To get to know, if there is enough space in the bus, press 9");
            System.out.println("To count monkeys, press 10");
            System.out.println("To remove the beginning and the end of the string, press 11");
            System.out.println("To call the function 'make equal', press 12");
            System.out.println("To sort an array with insertion sort algorithm, press 13");
            System.out.println("To exit, press 14");
            int menuKey = 5;
            try {
                menuKey = Integer.valueOf(keyboard.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("Sorry!There was a problem:(");
            }
            switch (menuKey) {
                case 1:
                    AlarmController alarmController = new AlarmController();
                    alarmController.view();
                    break;
                case 2:
                    FinalGradeController finalGradeController = new FinalGradeController();
                    finalGradeController.view();
                    break;
                case 3:
                    ReversedController reversedController = new ReversedController();
                    reversedController.view();
                    break;
                case 4:
                    RotationController rotationController = new RotationController();
                    rotationController.view();
                    break;
                case 5:
                    SumOfPositiveController sumOfPositiveController = new SumOfPositiveController();
                    sumOfPositiveController.view();
                    break;
                case 6:
                    ValuesDoubledController valuesDoubledController = new ValuesDoubledController();
                    valuesDoubledController.view();
                    break;
                case 7:
                    FileWorkController fileWorkController = new FileWorkController();
                    fileWorkController.view();
                    break;
                case 8:
                    StringToIntegerController stringToIntegerController = new StringToIntegerController();
                    stringToIntegerController.view();
                    break;
                case 9:
                    EnoughSpaceController enoughSpaceController = new EnoughSpaceController();
                    enoughSpaceController.view();
                    break;
                case 10:
                    MonkeyCountController monkeyCountController = new MonkeyCountController();
                    monkeyCountController.view();
                    break;
                case 11:
                    RemovePartsController removePartsController = new RemovePartsController();
                    removePartsController.view();
                    break;
                case 12:
                    MakeEqualController makeEqualController = new MakeEqualController();
                    makeEqualController.view();
                    break;
                case 13:
                    InsertionSortCotroller insertionSortCotroller = new InsertionSortCotroller();
                    insertionSortCotroller.view();
                    break;

                case 14:
                    System.out.println("You chose option 14:quit the session");
                    keyboard.close();
                    System.exit(-1);
                default:
                    System.out.println("You've entered the integer out of range.Try again");
                    break;
            }
        }


    }

}



