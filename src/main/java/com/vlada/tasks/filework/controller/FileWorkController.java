package com.vlada.tasks.filework.controller;

import com.vlada.tasks.filework.FileWork;

public class FileWorkController {
    public void view() {
        System.out.println("You chose option 7: read a song from file");
        FileWork.readFromFile();
    }
}
