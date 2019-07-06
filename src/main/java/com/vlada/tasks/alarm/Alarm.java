package com.vlada.tasks.alarm;

public class Alarm {
    public static void main(String[] args) {
    }

    public static void setAlarm(boolean employed, boolean vacation) {
        boolean setAlarm;
        if (employed == true && vacation == false) {
            setAlarm = true;
        } else {
            setAlarm = false;
        }
        System.out.println("setAlarm = " + setAlarm);
        if (setAlarm == true) {
            System.out.println("Your alarm will ring");
        } else if (setAlarm == false) {
            System.out.println("Sorry, your alarm won't ring. Have a good sleep!");
        }
    }
}
