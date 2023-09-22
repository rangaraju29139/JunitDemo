package org.example;

import java.util.List;

public class MyMath {
    public int sum(int[] numbers){
        int sum =0;
        for(int number : numbers){
            sum+=number;
        }
        return sum;
    }
}
