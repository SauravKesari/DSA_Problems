package com.company;

import java.util.Arrays;

public class Maximum_Gcd_Of_siblings_BinaryTree {
    public static void main(String[] args) {
        int[][] arr = {{4, 5}, {4, 2}, {2, 3}, {2, 1}, {3, 6}, {3, 12}};
        System.out.println(maxGcd(arr, arr.length));

    }
    static int gcd(int n1,int n2){
        while(n1!=n2){
            if(n1>n2)
                n1-=n2;
            else
                n2-=n1;

        }
        return n1;
    }
    static int largest(int first,int second){
        if(first>second)
            return first;
        else
            return second;
    }
    static int maxGcd(int[][]arr,int n){
        Arrays.sort(arr);
        int max=0;
        for (int i = 0; i <n-2 ; i++) {
            if(arr[i][0]==arr[i+1][0]){
                max=largest(max,gcd(arr[i][1],arr[i+1][1]));

            }
            i++;
        }
        return max;
    }

}
