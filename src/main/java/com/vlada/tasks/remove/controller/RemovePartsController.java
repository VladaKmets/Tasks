package com.vlada.tasks.remove.controller;

import com.vlada.tasks.remove.RemoveParts;

public class RemovePartsController {
    public void view() {
        System.out.println("You chose option 11: remove parts of a string");
        RemoveParts.removeStartAndEnd();
    }
}
