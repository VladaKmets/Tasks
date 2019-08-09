package com.vlada.tasks.monkeycount.controller;

import com.vlada.tasks.monkeycount.MonkeyCount;

public class MonkeyCountController {
    public void view() {
        System.out.println("You chose option 10: count monkeys");
        MonkeyCount.countMonkeys();
    }
}
