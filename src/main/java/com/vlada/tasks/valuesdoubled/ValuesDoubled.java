package com.vlada.tasks.valuesdoubled;

import java.util.Arrays;

public class ValuesDoubled {
    public static void main(String[] args) {
        Integer [] integers = {3,2,5,8,1,4};

        System.out.println(Arrays.deepToString(integers));
    }

    public static void calculate(Integer[] integers){
        for (int i = 0; i<integers.length; i++){
            integers[i] = integers[i]*2;
        }
    }
}
