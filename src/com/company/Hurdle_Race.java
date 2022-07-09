package com.company;

import java.util.ArrayList;
import java.util.List;

//link for question
//https://www.hackerrank.com/challenges/the-hurdle-race/problem?isFullScreen=true

public class Hurdle_Race {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        ls.add(5);
        ls.add(4);
        ls.add(3);
        ls.add(5);

        System.out.println(hurdleRace(5,ls));
    }
     static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int max=0;
        for(int i=0;i<height.size();i++){
            if(height.get(i)>max)
                max=height.get(i);
        }
        int ans=max-k;

        return (ans<=0)?0:ans;
    }
}
