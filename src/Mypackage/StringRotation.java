package Mypackage;

import java.util.Arrays;

public class StringRotation {
    static public void main(String[]args){
        System.out.println(caesarCipher("hello_worLd",3));
    }
    public static String caesarCipher(String s, int k) {
        // Write your code here
        String ans = "";
        int t =0;

        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                if(Character.isUpperCase(c)){
                    t=((int)(c + k-65))%26;

                    ans +=  String.valueOf((char)(t + 65));
                }
                else{
                    if(Character.isLowerCase(c)){
                        t=((int)(c + k-97))%26;

                        ans +=  String.valueOf((char)(t + 97));
                    }
                }
            }


            else{
                ans += c;
            }
        }
        return ans;
    }



}
