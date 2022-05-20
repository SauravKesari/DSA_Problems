package com.company;

//A pangram is a sentence where every letter of the English alphabet appears at least once.

public class PangramSentence {
    public static void main(String[] args) {
     String n="theuickqbrownfoxjumpsoverthelazydog";
        System.out.println(pangram(n));
    }
    static boolean pangram(String ss){
        if(ss.length() < 26)  // if it doesn't contain all 26 chars it means it's not qualifying, no need to waste time
            return false;
        for(int i = 'a'; i <= 'z'; i++){  // going through char a-z  to compare the given string ss
            if(ss.indexOf((char)i) == -1)   // indexOf feature to make sure char exists in the string, if not exists returns -1
                return false;
        }
        return true;

    }
}
