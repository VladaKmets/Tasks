package com.vlada.tasks.enoughSpace;

import java.util.Scanner;

public class EnoughSpace {
    public static void isThereEnoughSpace() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter the capacity of a bus");
        Integer capacity = keyboard.nextInt();
        System.out.println("Please, enter the number of passengers on board");
        Integer onBus = keyboard.nextInt();
        System.out.println("Please, enter the number of passengers waiting");
        Integer wait = keyboard.nextInt();
        if (capacity >= onBus + wait) {
            System.out.println("0 -- Bus can fit all " + wait + " passengers");
        } else {
            Integer cannotFit = (onBus + wait) - capacity;
            System.out.println(cannotFit + "-- Bus can't fit " + cannotFit + " passengers");
        }
    }
}
