package com.company;

import java.util.ArrayList;
import java.util.List;

public class kidsCandies {
    public static void main(String[] args) {
       int[] candy={1,4,3,2};
       int ex=2;
       List<Boolean> bl=candies(candy,ex);
        System.out.println(bl);

    }
    static List<Boolean> candies(int[] candies,int extraCandies){
        ArrayList<Boolean> list=new ArrayList<>();

        int max=Integer.MIN_VALUE;

        // Finding the greatest number in the array

        for(int i=0;i<candies.length;i++){

            if(candies[i]>max)  max=candies[i];


        }

        // Comaring the candies after adding exra candies with greates number of array

        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max) list.add(i,true);
            else  list.add(i,false);

        }
        return list;

    }
}
