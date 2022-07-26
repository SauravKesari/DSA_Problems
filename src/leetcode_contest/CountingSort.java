package leetcode_contest;

import java.util.*;

public class CountingSort {
    public static void main(String[] args) {
        Integer[] nums={3,3,1,3,2,1,0};
        List<Integer> al=Arrays.asList(nums);
        List<Integer> res=new ArrayList<>();
        res=count2(al);
        System.out.println(res);
    }
    static List<Integer> count2(List<Integer> arr) {
        List<Integer> res = new ArrayList<Integer>(Collections.nCopies(100, 0));
        for(Integer a : arr)
            res.set(a, res.get(a)+1);
        return res;

    }

        static List<Integer> count(List<Integer> arr){
        Integer[] zeros=new Integer[arr.size()];
        List<Integer> al=Arrays.asList(zeros);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.size();i++){
            if(map.containsKey(arr.get(i))){
                map.put(arr.get(i),map.get(arr.get(i))+1);
            }
            else{
                map.put(arr.get(i),1);
            }
        }
//        for (Integer el:map.keySet()){
//            System.out.println(el+" "+map.get(el));
//        }
        for(Integer el:map.keySet()){
            zeros[el]=map.get(el);
        }
       // System.out.println(Arrays.toString(zeros));

       return al;
    }
}
