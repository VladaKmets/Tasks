package com.vlada.tasks.rotation;

import com.vlada.tasks.utils.Constants;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter an integer to specify the size of an array");
        Integer arraySize = getIntFromUser(scanner);
        Integer[] someArray = new Integer[arraySize];
        generateArray(someArray, arraySize);
        System.out.println(Arrays.deepToString(someArray));
        System.out.println();
        System.out.println("Please, enter the number of times to rotate the array");
        int rotationTimes = getIntFromUser(scanner);
        Integer[] rotatedToTheRightArray = copyArray(someArray);
        Integer[] rotatedToTheLeftArray = copyArray(someArray);
        System.out.println("Please, specify how to rotate an array: right(R) or left(L)");
        String rotation = scanner.next();
        if (rotation.equals(Constants.RIGHT)) {
            for (int i = 0; i < rotationTimes; i++) {
                rotateToTheRight(rotatedToTheRightArray, rotationTimes);
            }
            System.out.println("Generated array was rotated to the right " + rotationTimes + " times");
            for (int i = 0; i < rotatedToTheRightArray.length; i++) {
                System.out.println(rotatedToTheRightArray[i] + "\t");
            }
        } else if (rotation.equals(Constants.LEFT)) {
            for (int i = 0; i < rotationTimes; i++) {
                rotateToTheLeft(rotatedToTheLeftArray, rotationTimes);
            }
            System.out.println("Generated array was rotated to the left " + rotationTimes + " times");
            for (int i = 0; i < rotatedToTheLeftArray.length; i++) {
                System.out.println(rotatedToTheLeftArray[i] + "\t");
            }
        }
        scanner.close();
    }

    public static int getIntFromUser(Scanner scanner) {
        int intFromUser = 0;
        try {
            intFromUser = scanner.nextInt();
            if (intFromUser <= 0) throw new IllegalArgumentException();
        } catch (IllegalArgumentException exception) {
            System.out.println("Sorry, the integer must be greater than 0. The program will be closed");
            System.exit(-1);
        }
        return intFromUser;
    }


    public static void generateArray(Integer[] arrayToGenerate, int rangeOfNumbers) {
        Random generator = new Random();
        for (int i = 0; i < arrayToGenerate.length; i++) {
            int gn = generator.nextInt(rangeOfNumbers);
            arrayToGenerate[i] = gn;
        }

    }

    public static Integer[] copyArray(Integer[] m) {
        Integer[] copiedArray = new Integer[m.length];
        for (int i = 0; i < m.length; i++) {
            copiedArray[i] = m[i];
        }
        return copiedArray;
    }

    public static void rotateToTheRight(Integer[] m, int rotationTimes) {
        for (int i = 0; i < rotationTimes; i++) {
            for (int columnIndex = 0; columnIndex < m.length - 1; columnIndex++) {
                int temp = m[0];
                m[0] = m[columnIndex + 1];
                m[columnIndex + 1] = temp;

            }
        }
    }

    public static void rotateToTheLeft(Integer[] m, int rotationTimes) {
        for (int i = 0; i < rotationTimes; i++) {
            for (int columnIndex = m.length - 1; columnIndex > 0; columnIndex--) {
                int temp = m[m.length - 1];
                m[m.length - 1] = m[columnIndex - 1];
                m[columnIndex - 1] = temp;
            }
        }
    }
}
