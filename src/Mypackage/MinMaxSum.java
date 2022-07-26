package Mypackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();


        al.add(396285104);
        al.add(573261094);
        al.add(759641832);
        al.add(819230764);
        al.add(364801279);
        sum(al);
    }
    static void sum(List<Integer>arr){
        int n=arr.size();
        long min=0,max=0;

        Collections.sort(arr);
        int i;
        for(i=0;i<n-1;i++){
            min+=arr.get(i);
        }
        for (int j = n-1; j >0 ; j--) {
            max+=arr.get(j);
        }
        System.out.println(min+" "+max);

    }
}
