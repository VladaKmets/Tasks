package com.vlada.tasks.remove;

import java.util.Scanner;

public class RemoveParts {
    public static void removeStartAndEnd() {
        System.out.println("Please, enter the string");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(string.substring(1, string.length() - 1));
    }
}
