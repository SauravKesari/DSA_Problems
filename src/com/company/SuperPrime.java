package com.company;

public class SuperPrime {
    public static void main(String[] args) {
        System.out.println(superPrime(5));



    }
    public static int superPrime(int n){
        int count=0;
        int sum=0;
        for (int i = 3; i <=n ; i++) {
            sum=2;
            int ele=isPrime(i);
            if(ele>-1){
                sum+=ele;
                int sum1=isPrime(sum);
                if(sum1>-1) {
                    while (sum1 <= n) {
                        count++;
                        break;

                    }
                }
            }

        }
        return count;
    }
    public static int isPrime(int n){
        int flag=0;
        for (int i = 2; i <n; i++) {
            if(n%i==0) {
                flag = 1;
            }
        }
        if(flag==0){
            return n;
        }
        else{
            return -1;
        }
    }
}
