package com.company;

public class Sorting {
    public static void main(String[] args) {
        int[]arr={7,8,3,1,2};
        insertionSort(arr);
    }
    static void printArr(int[]arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    //Insertion sort
    static void insertionSort(int[]arr){
        for (int i = 1; i < arr.length ; i++) {
            int current=arr[i];
            int j=i-1;

            //Make space in sorted array for new Element
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            //Placement of element
            arr[j+1]=current;
        }
        printArr(arr);
    }
    //Selection Sort
    static void selectionSort(int[]arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            int smallest=i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;

        }
        printArr(arr);
    }
    //Bubble Sort
    //time complexity=O(n^2)
    static void bubbleSort(int[]arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArr(arr);
    }
}
