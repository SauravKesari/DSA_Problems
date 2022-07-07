package com.company;

import java.util.Arrays;

//link
//https://practice.geeksforgeeks.org/problems/even-and-odd/1#
public class Even_Odd_Based_Array {
    public static void main(String[] args) {
        int[]arr={4,3,8,5};
        reArrange(arr,arr.length);

//        System.out.println(check(arr, arr.length));
//        System.out.println(Arrays.toString(arr));
        int[] a={1,2,4,5,8};
        int[] b={5,8,2,4,1};
        System.out.println(check(a,b,a.length));
    }
    static void reArrange(int[]arr,int n){
        int i = 0, j = 1;
        while(i < n && j < n) {
            if(arr[i] % 2 != 0 && arr[j] % 2 != 1) {
                swap(arr,i,j);
                i += 2;
                j += 2;
            }
            else if(arr[i] % 2 == 0 && arr[j] % 2 == 1) {
                i += 2;
                j += 2;
            }
            else if(arr[i] % 2 == 0)
                i += 2;
            else if(arr[j] % 2 == 1)
                j += 2;
        }
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static boolean check(int[]a,int[]b,int n){
        Arrays.sort(a);
        Arrays.sort(b);
        int count=0;
        for (int i = 0; i < n; i++) {
            if(a[i]==b[i])
                count++;
        }
        if(count==n){
            return true;
        }
        return false;
    }
    static boolean check(int[]arr,int n){
        int c=0,d=0;
        boolean flag=true;
        for (int i = 0; i <n ; i++) {
            if(i%2==0){
                if(arr[i]%2==1){
                    flag=false;
                    break;
                }
                else{
                    c++;
                }
            }
            else{
                if(arr[i]%2==0){
                    flag=false;
                    break;
                }else{
                    d++;
                }
            }
        }
        if(c!=d)
            flag=false;
        return  flag;

    }
}
