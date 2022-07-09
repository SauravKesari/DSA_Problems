package com.company;

public class BrainGame {
    public static void main(String[] args) {
        System.out.println(isPrime(4));
        int[]nums={2,4,5,7};

        System.out.println(brainGame(nums));
    }
    static boolean brainGame(int[] nums)
    {
        int turn=1;//Player A
        int count=0;
        for (int i = 0; i < nums.length ; i++) {
            if(isPrime(nums[i])){
                count++;
            }
            else{
                turn=0;

            }
        }
        if(count== nums.length){
            return false;
        }
        else {
            return true;
        }
    }
    static boolean isPrime(int n){
        boolean flag=false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=true;
            }
        }
        if(!flag){
            return true;
        }else{
            return false;
        }
    }
}
