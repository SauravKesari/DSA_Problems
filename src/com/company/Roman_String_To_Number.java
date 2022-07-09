package com.company;

public class Roman_String_To_Number {
    public static void main(String[] args) {
        System.out.println(romantoNum("IV"));
    }
    //another method

    static int romantoNum(String s) {
        int res = 0;
        int nums = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            //getting value of symbol s[i]
            switch (s.charAt(i)) {
                case 'I':
                    nums = 1;
                    break;
                case 'V':
                    nums = 5;
                    break;
                case 'X':
                    nums = 10;
                    break;
                case 'L':
                    nums = 50;
                    break;
                case 'C':
                    nums = 100;
                    break;
                case 'D':
                    nums = 500;
                    break;
                case 'M':
                    nums = 1000;
                    break;
            }
            if (prev > nums) {
                res = res - nums;
            } else {
                res = res + nums;
            }
            prev = nums;
        }
        return res;
    }
}
