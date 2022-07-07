package com.company;

import java.util.Arrays;

public class waveArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        wave(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void wave(int []arr,int n){
        for (int i = 0; i <n ; i+=2) {
            if(arr[i]<=arr[i+1]){
                swap(arr,i,i+1);

            }
        }
    }
    static void  swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
