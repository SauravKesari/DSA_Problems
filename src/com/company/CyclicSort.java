package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort {
    public static void main(String[] args) {
     int[] arr={1,2,5,4,3,2};
        System.out.println(duplicateElem(arr));
     //ArrayList<Integer> ans=new ArrayList<>();
     //ans= (ArrayList<Integer>) disappearedElement(arr);
       // System.out.println(ans);
     //Sort(arr);
     //System.out.println(Arrays.toString(arr));
     //int[] nums={1,0,2,3};
       // System.out.println(missingElement(nums));
    }
    static void Sort(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if( arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    //Q1.Missing element in array[1,n]
    //n=5 where arr=[1,5,4,2] here 3 is missing that's why output will be 3 or index+1(2+1)


    static int missingElement(int[]arr){
        int i=0;
        while (i< arr.length){
            int correct=arr[i];
            if(arr[i]< arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }

        }
        for (int j = 0; j < arr.length ; j++) {
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }


    //Q2.Duplicate element in [1,n]array
    //here only one repeated element in array that means N=n+1 element will be in an array
    //arr=[1,5,4,2,3,2] here the ans will be 2
    static int duplicateElem(int[]arr){
        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=i+1){
                if(arr[i]!=arr[correct]){
                    swap(arr, i, correct);
                }
                else {
                    //return i(index of 2nd occurrence of duplicate number)
                    return arr[i];
                }
            }else{
                i++;
            }

        }

     return -1;
    }


    //Q3.Find all Numbers disappeared in array where arr[1,n] range
    //arr=[1,4,5,2,3,5,4,8] where missing number is [6,7] because the array member should be[1,2,3,4,5,6,7,8]
    static List<Integer> disappearedElement(int[]arr){
        int i=0;
        while(i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for (int j = 0; j <arr.length ; j++) {
            if(arr[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
}