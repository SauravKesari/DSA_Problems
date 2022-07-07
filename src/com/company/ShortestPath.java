package com.company;

//https://practice.geeksforgeeks.org/problems/shortest-path-between-cities/1#
public class ShortestPath {
    public static void main(String[] args) {
        System.out.println(shortPath(2,6));
    }
    static int shortPath(int x,int y){
        int length=0;
        while(x!=y){
            if(x<y){
                y=y/2;
            }else{
                x=x/2;
            }
            length=length+1;
        }
        return length;
    }
}
