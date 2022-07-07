package com.company;

public class Count_bits {
    public static void main(String[] args) {
        int a=4;
        String ans=convertToBinary(a);
        System.out.println(ans);


    }
    static String convertToBinary(int n){
        String res="";
        String binaryRes="";
        int rem=0;
        while(n>0) {
            rem = n % 2;
            res += rem;
            n = n / 2;

        }
        for (int i = res.length()-1; i >=0 ; i--) {
            binaryRes+=res.charAt(i);
        }
        return binaryRes;
    }
}
