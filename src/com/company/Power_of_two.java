package com.company;

import java.util.Arrays;

public class Power_of_two {
    public static void main(String[] args) {
        //System.out.println(isPowerOf2(16));
        //toggle(5,2);
        //System.out.println("Count of No of 1's is:- "+count_No_ofOnes(5));
        String s=new String("101011");
        System.out.println(binarytoDecimal(s));
        decimaltoBinary(43);

    }

    //Counting no of 1's in binary Number
    static int count_No_ofOnes(int number){
        if(number==0){
            return 0;
        }
        int count=0;
        //int count = 0;
        while (number != 0) {
            number &= (number - 1);
            count++;
        }

        //Read more: https://www.java67.com/2016/01/how-to-count-number-of-1s-in-given-bit-sequence-in-java.html#ixzz7UVSoavvv
        return count;
    }
    static boolean isPowerOf2(int x){
        return x!=0 && ((x&(x-1)) == 0);

    }
    //toggle a bit based on position
    static void toggle(int num,int pos){
        int bitmask=1<<pos;
        if((bitmask & num)==0){
            int newNumber=num ^ bitmask;
            System.out.println(newNumber);
        }
        else{
            int newNumber=num ^ bitmask;
            System.out.println(newNumber);

        }
    }
    //binary to decimal
    static int binarytoDecimal(String n){
        String num=n;
        int dec_val=0;
        //Set the base value to 1 i.e 2^0=1
        int base=1;

        for (int i = num.length()-1; i >=0 ; i--) {
            if(num.charAt(i)=='1'){
                dec_val+=base;
            }
            base=base*2;
        }
        return dec_val;
    }
    //decimal to binary
    static void decimaltoBinary(int n){
        int[] arr=new int[32];
        int count=0;
        while(n!=0){
            int rem=n%2;
            arr[count]=rem;
            n=n/2;
            count++;
        }
        //System.out.println(Arrays.toString(arr));
        for (int i = count-1; i >=0 ; i--) {
            System.out.print(arr[i]);
        }
    }
}
