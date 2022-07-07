package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicate_Elements {
    public static void main(String[] args) {
        ArrayList<Integer> res=new ArrayList<>();
        int[]arr={1,1,3,2,4,5,3};
        res=duplicates(arr, arr.length);
        if(res.size()==0){
            System.out.println("-1");;
        }
        for(int i=0;i< res.size();i++){
            System.out.println(res.get(i));
        }
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> al=new ArrayList<>(n);
        Arrays.sort(arr);

        int k=-1;
        for (int i = 1; i <n ; i++) {
            if(arr[i-1]==arr[i] && (k!=arr[i])) {
                al.add(arr[i]);
                k=arr[i];
            }
        }
        if(al.size()==0){
            al.add(-1);
        }
        return al;
    }
}
