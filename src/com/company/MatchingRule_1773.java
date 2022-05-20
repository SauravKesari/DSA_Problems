package com.company;

import java.util.ArrayList;

public class MatchingRule_1773 {
    public static void main(String[] args) {
     ArrayList<ArrayList<String>> mainList=new ArrayList<ArrayList<String>>();
     ArrayList<String> m1=new ArrayList<>();
     m1.add("Phone");
     m1.add("blue");
     m1.add("Silver");

        ArrayList<String> m2=new ArrayList<>();
        m2.add("computer");
        m2.add("Silver");
        m2.add("lenovo");

        ArrayList<String> m3=new ArrayList<>();
        m3.add("Phone");
        m3.add("gold");
        m3.add("iphone");
     mainList.add(m1);
     mainList.add(m2);
     mainList.add(m3);

        System.out.println(mainList);
        System.out.println(countMatches(mainList,"Silver","lenovo"));

    }
    static  int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
        int res = 0, ind;
        if (ruleKey.equals("type"))
            ind = 0;
        else if (ruleKey.equals("color"))
            ind = 1;
        else
            ind = 2;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(ind).equals(ruleValue))
                res++;
        }
        return res;
    }

    }
