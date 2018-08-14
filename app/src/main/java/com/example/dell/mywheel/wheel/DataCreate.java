package com.example.dell.mywheel.wheel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 2018/8/14.
 */

public class DataCreate {

    public static List<Integer> timeDate(int min,int max,int stepSize){
        List<Integer> list = new ArrayList<>();
        for (int i = min; i <max ; i+=stepSize) {
            list.add(i);
        }
        return list;
    }



}
