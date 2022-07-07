package com.company;
//Link of Question
//https://practice.geeksforgeeks.org/problems/non-repeating-element3958/1/#
public class NotRepeatingElement {
    public static void main(String[] args) {
        int [] arr={1,2,3,2,3,1,5};
        System.out.println(find(arr,6));
    }
    static int find(int[]arr,int n) {
        int count;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count==0) {
                return arr[i];
            }
        }
        return 0;
    }
}
