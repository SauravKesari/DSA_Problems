package com.company;

public class nCr_mod_m {
    public static void main(String[] args) {
        //System.out.println(factorial(8412638));
        System.out.println(nCrModM(7993677, 7989454 ,99287));
    }
    static long  factorial(int n){
        long sum=0;
        if(n==0 ||n==1)
            return 1;
        else {
            sum = n * factorial(n - 1);
            return sum;
        }
    }
    static int nCrModM(int n, int r, int m){
        long res=factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println("res"+res+" "+" "+factorial(n)+" "+factorial(r)*factorial(n-r));
        int ans=(int)res%m;
        return ans;
    }

}
