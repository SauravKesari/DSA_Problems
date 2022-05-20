package com.company;

import java.util.Arrays;

public class Flip_Image_832 {
    public static void main(String[] args) {
        int[][] nums={{1,1,0},{1,0,1},{0,0,0}};
     //   System.out.println(nums.length);
        int[][] res=flipAndInvertImage(nums);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length ; j++) {
                System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static int[][] flipAndInvertImage(int[][] image){
        int size = image[0].length;
        for(int[] row: image) {
            for(int i = 0; i < (size + 1) / 2; i++) {
                int temp = row[i];
                row[i] = row[size - i - 1];
                row[size - i - 1] = temp;
            }
            for(int i = 0; i < size; i++) {
                row[i] = row[i] == 0 ? 1 : 0;
            }
        }
        return image;

    }
}
