package com.vlada.tasks.insertionSort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static void sort() {
        List<Integer> arrayToSort = getArrayToSort();


        for (int j = 1; j < arrayToSort.size(); j++) {
            int key = arrayToSort.get(j);
            int i = j - 1;
            while (i >= 0 && arrayToSort.get(i) > key) {
                arrayToSort.set(i + 1, arrayToSort.get(i));
                System.out.println(Arrays.toString(arrayToSort.toArray()));
                i = i - 1;
            }
            arrayToSort.set(i + 1, key);
            System.out.println(Arrays.toString(arrayToSort.toArray()));
        }
    }


    private static List<Integer> getArrayToSort() {
        List<Integer> arrayToSort = new ArrayList<Integer>();
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("insertionsort.txt");
            bufferedReader = new BufferedReader(fileReader);
            String sCurrentLine;
            while ((sCurrentLine = bufferedReader.readLine()) != null) {
                arrayToSort.add(Integer.valueOf(sCurrentLine));
            }
            System.out.println("Massive to sort is " + arrayToSort);
            return arrayToSort;
        } catch (IOException e) {
            System.out.println("Something went wrong. Contact admin.");
            throw new IllegalStateException("File can't be reached", e);
        } catch (NumberFormatException e) {
            System.out.println("Your input number is too big");
            throw new IllegalStateException("Input number is too big", e);
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
    }
}
