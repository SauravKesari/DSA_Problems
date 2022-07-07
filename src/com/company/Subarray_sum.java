package com.company;

//Link
//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum

import java.util.ArrayList;
import java.util.Arrays;

public class Subarray_sum {
    public static void main(String[] args) {
        int[] arr={15,2,4,8,9,5,10,23};
        ArrayList<Integer> res=new ArrayList<>();
        res.add(4,10);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
        System.out.println(subArraySum(arr,arr.length,33));
    }
    static int  subArraySum(int arr[], int n, int sum)
    {
        int curr_sum, i, j;

        // Pick a starting point
        for (i = 0; i < n; i++) {
            curr_sum = arr[i];

            // try all subarrays starting with 'i'
            for (j = i + 1; j <= n; j++) {
                if (curr_sum == sum) {
                    int p = j - 1;
                    System.out.println(
                            "Sum found between indexes " + i
                                    + " and " + p);
                    return 1;
                }
                if (curr_sum > sum || j == n)
                    break;
                curr_sum = curr_sum + arr[j];
            }
        }

        System.out.println("No subarray found");
        return 0;
    }
    static ArrayList<Integer> sumAllSubarray(int[] arr,int n,int sum){
        ArrayList<Integer> res=new ArrayList<>();
        int cur_sum=0,start=0;
        for (int i = 0; i <arr.length ; i++) {
            cur_sum=arr[i];
            for (int j = i+1; j <=n ; j++) {
                if(cur_sum==sum){
                    int p=j-1;
                    res.add(i,p);
                    break;
                }
                if(cur_sum>sum ||j==n)
                    break;
                cur_sum+=arr[j];
            }
        }
        return res;
    }

}
