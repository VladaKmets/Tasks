package com.vlada.tasks.enoughSpace.controller;

import com.vlada.tasks.enoughSpace.EnoughSpace;

public class EnoughSpaceController {
    public void view() {
        System.out.println("You chose option 9: get to know, if there is enough space on the bus");
        EnoughSpace.isThereEnoughSpace();
    }
}
