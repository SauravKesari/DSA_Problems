package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArray_1389 {
    public static void main(String[] args) {


      int[] nums={1,2,3,4,0};
      int[] idx={0,1,2,3,0};
        int[] ans=target2(nums,idx);

        System.out.println(Arrays.toString(ans));
    }
     static int[] target2(int[]nums,int[]index){
        ArrayList<Integer> list = new ArrayList();
        for(int i=0;i<nums.length;i++) {

            list.add(index[i], nums[i]);

        }

        //System.out.println(list);

        int [] arr = new int [list.size()];
        for(int i=0;i<list.size();i++)
            arr[i]=list.get(i);

        return arr;

    }
}
