package com.vlada.tasks.stringtointeger;

import java.util.Scanner;

public class StringToInteger {
    public static int stringToInteger() {
        System.out.println("Please, enter your number in String");
        Scanner keyboard = new Scanner(System.in);
        String number = keyboard.nextLine();
        Integer result = Integer.valueOf(number);
        System.out.println(result);
        keyboard.close();
        return result;
    }
}
