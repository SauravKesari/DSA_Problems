package com.company;

import java.sql.SQLOutput;

class Pair{
    long first,second;
    public Pair(long f,long s){
        this.first=f;
        this.second=s;
    }
}
public class MinMax {
    public static void main(String[] args) {
        long[] arr={1,14,15,5897};
        Pair res=find(arr,4);
        System.out.println(res.first);
        System.out.println(res.second);
    }
    static Pair find(long[] a,int n){
        long min=a[0];
        long max=a[0];
        for (int i = 1; i < n; i++) {
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        Pair p=new Pair(min,max);
        return p;

    }
}
