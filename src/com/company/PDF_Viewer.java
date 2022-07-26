package com.company;


import java.util.*;

//link
//https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
public class PDF_Viewer {
    public static void main(String[] args) {
        //Height of pdf
//        List<Integer> height=new ArrayList<>();
//        for (int i = 1; i <=26 ; i++) {
//            height.add(i%3+3);
//        }
//        System.out.println(height);
//
//        //Taking string as input
//        System.out.println(designerPdfViewer(height,"world"));
//        System.out.println(beautifulDays(20,23,6));

        ArrayList<String> al=new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("A");
        al.add("A");
        al.add("C");
        al.add("B");
        al.add("B");
        al.add("B");
        al.add("A");
        al.add("A");
        al.add("A");
        mostActive(al);
    }

    static int designerPdfViewer(List<Integer> h, String word) {
        int result=0;
        List<Character> leter=new ArrayList<Character>();
        for (int i = 97; i <123 ; i++) {
            leter.add((char)i);
        }
        char[] letters=word.toCharArray();

        ArrayList<Integer> temp=new ArrayList<Integer>();
        for(int i=0;i<leter.size();i++){
            for (int j = 0; j < letters.length; j++) {
                if(letters[j]==leter.get(i)){
                    int index=i;
                    temp.add(h.get(index+1));
                }
            }
        }
        //System.out.println(temp);
        int maxNum=findMax(temp);
        //System.out.println();
        return maxNum*word.length();

    }
    static  int findMax(ArrayList<Integer> al){
        int max=0;
        for (int i = 0; i < al.size() ; i++) {
            if(al.get(i)>max)
                max=al.get(i);
        }
        return max;
    }

    public static int beautifulDays(int start, int end, int k) {
        // Write your code here
        int count=0;
        for(int i=start;i<=end;i++){
            int reversenum=reverse(i);
            int result=Math.abs(i-reversenum);
            if(result%k==0){
                count++;
            }
        }
        return count;
    }
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }

    static void mostActive(ArrayList<String> customer){
        Map<String,Integer> map=new HashMap<>();
        for(String item:customer){
            if(map.containsKey(item)){
                map.put(item,map.get(item)+1);
            }else{
                map.put(item,1);
            }
        }
        int sizeList=customer.size();
        ArrayList<String> res=new ArrayList<>();
        System.out.println(map);
        map.entrySet().forEach(entry -> {
            int val=entry.getValue();
            System.out.println((float) (val/sizeList));
            //float per=val/ customer.size();
            //float per=(float)(entry.getValue()/ customer.size())*100;
            //System.out.println(per);
            //if(per>5){
              //  res.add(entry.getKey());
            //}
        });

    }

}