package com.company;
import Mypackage.*;
public class BitManipulation {
    public static void main(String[] args) {
        int a=5;
        int pos=2;
        int bitmask=1<<pos;
        //Checking the bit using get operation
        if((bitmask & a)==0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }

        //changing the bit and number by bitwise or operation
        int newNumber=bitmask | a;
        System.out.println(newNumber);

        String s="hello";
        StringBuilder sb=new StringBuilder(s);
        int[] index={0,4};
        String[] source={"h","l"};
        System.out.println(sb.indexOf("l"));
        for (int i = 0; i <index.length ; i++) {
            for (int j = 0; j < source.length; j++) {
                if(sb.indexOf(source[j])==index[i]){
                    sb.insert(index[i],"jail");
                }
            }
        }
        System.out.println(sb);

        sb.insert(0,"geeks");
        sb.insert(2,"geeks");

        System.out.println(sb);

        Emplaoyee e=new Emplaoyee(1,"Jigar",8560);
        e.printEmployee();



    }
}
