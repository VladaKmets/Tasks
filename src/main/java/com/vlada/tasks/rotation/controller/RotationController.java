package com.vlada.tasks.rotation.controller;

import com.vlada.tasks.rotation.Rotation;

import java.util.Arrays;
import java.util.Scanner;

public class RotationController {
    public void view() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You chose option 4: rotate the massive of integers");
        System.out.println("Please, enter an integer to specify the size of an array");
        Integer arraySize = Rotation.getIntFromUser(keyboard);
        Integer[] someArray = new Integer[arraySize];
        Rotation.generateArray(someArray, arraySize);
        System.out.println(Arrays.deepToString(someArray));
        System.out.println();
        System.out.println("Please, enter the number of times to rotate the array");
        int rotationTimes = Rotation.getIntFromUser(keyboard);
        Integer[] rotatedToTheRightArray = Rotation.copyArray(someArray);
        Integer[] rotatedToTheLeftArray = Rotation.copyArray(someArray);
        System.out.println("Please, specify how to rotate an array: right(R) or left(L)");
        String rotation = keyboard.next();
        if (rotation.equals("R")) {
            for (int i = 0; i < rotationTimes; i++) {
                Rotation.rotateToTheRight(rotatedToTheRightArray, rotationTimes);
            }
            System.out.println("Generated array was rotated to the right " + rotationTimes + " times");
            for (int i = 0; i < rotatedToTheRightArray.length; i++) {
                System.out.println(rotatedToTheRightArray[i] + "\t");
            }
        } else if (rotation.equals("L")) {
            for (int i = 0; i < rotationTimes; i++) {
                Rotation.rotateToTheLeft(rotatedToTheLeftArray, rotationTimes);
            }
            System.out.println("Generated array was rotated to the left " + rotationTimes + " times");
            for (int i = 0; i < rotatedToTheLeftArray.length; i++) {
                System.out.println(rotatedToTheLeftArray[i] + "\t");
            }
        }
    }


}
