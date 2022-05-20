package com.company;

class Solution{
    int transform(String A,String B){
        int steps=0;
        for (int i = 0; i <A.length() ; i++) {
            if(A.charAt(i)==B.charAt(i))
                return 0;
            else{

            }
        }
        return steps;
    }
}
public class TransformString {
    public static void main(String[] args) {
        String a="abd";
        for (int i = 0; i <a.length() ; i++) {
            System.out.println(a.charAt(i));
        }
    }
}
