package Mypackage;

import java.util.Arrays;

public class Braces {
    public static void main(String[] args) {
        String s="World hel2o";
        System.out.println(decryptMessage(s));
        int a=010;
        System.out.println(a);
    }
    public static String decryptMessage(String encryptedMessage) {
//        StringBuilder sb=new StringBuilder(encryptedMessage);
        char[]arr=encryptedMessage.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='2' && arr[i]<='9'){
                char item=arr[i-1];
                arr[i]=item;
            }
        }
        String s=String.valueOf(arr);
        String nstr="";
        String[] str=s.split(" ");
        for(int i= str.length-1;i>=0;i--){
            nstr+=str[i]+" ";
        }

        return  nstr;
    }
}
