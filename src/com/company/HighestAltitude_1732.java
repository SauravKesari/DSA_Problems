package com.company;

public class HighestAltitude_1732 {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < gain.length; i++) {
            sum=sum+gain[i];
            max = Math.max(max,sum );
        }

        if(max<0)return 0;
        return max;

    }

}
