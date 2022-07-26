package leetcode_contest;

import java.util.Arrays;

public class ZigzagSquence {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7};
        print(nums, nums.length);
    }
    static void print(int[]a,int n){
        Arrays.sort(a);
        int mid = (n + 1)/2-1;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n-2;
        while(st<=ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void printZigzag(int[]nums,int n){
        Arrays.sort(nums);
        int mid=(n+1)/2;
//        int t=nums[mid];
//        nums[mid]=nums[n-1];
//        nums[n-1]=t;

        int start=mid;
        int end=n-1;

        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start+=1;
            end-=1;
        }
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
