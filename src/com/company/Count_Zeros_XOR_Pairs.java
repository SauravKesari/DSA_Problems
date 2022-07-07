package com.company;

public class Count_Zeros_XOR_Pairs {
    public static void main(String[] args) {
        int[]arr={1,1,1};
        System.out.println(CountPairs(arr,arr.length));
        System.out.println(isPowerOfTwo(62));
    }
    static int CountPairs(int[]arr,int n){
        int count=0;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i]-arr[j]==0){
                    count++;
                }
            }
        }
        return count;
    }
    // Function to check if x is power of 2
    static boolean isPowerOfTwo(int x)
    {
        // First x in the below expression is
        // for the case when x is 0
        return x!=0 && ((x&(x-1)) == 0);

    }

}
