package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//link
//https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
public class PDF_Viewer {
    public static void main(String[] args) {
        //Height of pdf
        List<Integer> height=new ArrayList<>();
        for (int i = 1; i <=26 ; i++) {
            height.add(i%3+3);
        }
        System.out.println(height);

        //Taking string as input
        System.out.println(designerPdfViewer(height,"world"));
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
}