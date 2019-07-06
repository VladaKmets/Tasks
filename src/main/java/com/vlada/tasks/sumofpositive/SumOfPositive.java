package com.vlada.tasks.sumofpositive;

public class SumOfPositive {
    public static void main(String[] args) {
        Integer arrayOfNumbers[] = {-2, 5, 3, -7, 15};
        getSumOfPositive(arrayOfNumbers);
    }

    public static Integer getSumOfPositive(Integer[] arrayGiven) {
        Integer arrayOfNumbers[] = {-2, 5, 3, -7, 15};
        Integer sumOfPositive = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] > 0) {
                sumOfPositive += arrayOfNumbers[i];
                System.out.println(sumOfPositive);
            }
        }
        return sumOfPositive;
    }
}
