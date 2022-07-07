package com.company;

import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String n=scan.next();
        String[] arr=n.split("@");
        System.out.println(arr[0]);



        //        StringBuilder sb=new StringBuilder(n);
//
//        for (int i = 0; i <sb.length()/2 ; i++) {
//            int front=i;
//            int back=sb.length()-1-i;
//
//            char frontChar= sb.charAt(front);
//            char backChar=sb.charAt(back);
//
//            sb.setCharAt(front,backChar);
//            sb.setCharAt(back,frontChar);
//        }
//        String reverse= String.valueOf(sb);
//        if(reverse.compareTo(n)==0){
//            System.out.println("Strings are Equal");
//        }
//        else{
//            System.out.println("Strings are not Equal");
//        }

    }
}
