package com.vlada.tasks.makeEqual;

import java.util.Arrays;
import java.util.Scanner;

public class MakeEqual {
    public static int count() {
        int count = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter the number of elements of a massive");
        String numberOfElements = keyboard.nextLine();
        int numberOfIntegers = Integer.valueOf(numberOfElements);
        Integer[] arrayOfIntegers = new Integer[numberOfIntegers];

        for (int i = 0; i < numberOfIntegers; i++) {
            System.out.println("Please, enter an integer");
            String arrayOfInts = keyboard.nextLine();
            arrayOfIntegers[i] = Integer.valueOf(arrayOfInts);
        }
        System.out.println(Arrays.toString(arrayOfIntegers));
        System.out.println("Please, enter a number to make equal every integer in array to");
        String toMakeEqualTo = keyboard.nextLine();
        int integerToMakeEqualTo = Integer.valueOf(toMakeEqualTo);
        System.out.println("Please, enter a number to add/extract");
        String toAddOrExtract = keyboard.nextLine();
        int integerToAddOrExtract = Integer.valueOf(toAddOrExtract);
        for (int i = 0; i < numberOfIntegers; i++) {
            int toCompare = arrayOfIntegers[i];
            while (toCompare < integerToMakeEqualTo) {
                toCompare += integerToAddOrExtract;
            }
            while (toCompare > integerToMakeEqualTo) {
                toCompare -= integerToAddOrExtract;
            }
            if (integerToMakeEqualTo == toCompare) {
                count++;
            }
        }
        System.out.println(count);
        keyboard.close();
        return count;
    }
}
