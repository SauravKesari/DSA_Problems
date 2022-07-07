package com.company;

import java.util.Scanner;

public class Spiral_Circular_Matrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=3;
        int m=3;
        int[][] arr=new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                int elem= scanner.nextInt();
                arr[i][j]=elem;
            }
        }
        
        //Print matrix
        System.out.println("Original Matrix");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        
        //Spiral matrix
        System.out.println("Spiral Matrix");
        int rowStart=0,colStart=0;
        int rowEnd=n-1,colEnd=m-1;
        
        while(rowStart<=rowEnd && colStart<=colEnd){
            //First row
            for (int i = colStart; i <=colEnd ; i++) {
                System.out.print(arr[rowStart][i]+"\t");
            }
            rowStart++;

            //Second row
            for(int i=rowStart;i<=rowEnd;i++){
                System.out.print(arr[i][colEnd]+"\t");
            }
            colEnd--;

            //3
            for (int i = colEnd; i >=colStart ; i--) {
                System.out.print(arr[rowEnd][i]+"\t");
            }
            rowEnd--;

            for (int i = rowEnd; i >=rowStart ; i--) {
                System.out.print(arr[i][colStart]+"\t");
            }
            colStart++;


            System.out.println();
        }

    }
}
