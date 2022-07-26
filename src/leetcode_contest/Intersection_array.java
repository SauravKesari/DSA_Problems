package leetcode_contest;

import java.util.*;

public class Intersection_array {
    public static void main(String[] args) {
        int[][]nums={{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
//        int[] arr={0,0,0,0};
//        List<Integer> al=new ArrayList<Integer>();
//        Collections.addAll();
//        System.out.println(al);
        String[] array = {"a", "b", "c", "d", "e"};
        Integer[]arr={2,4,6,8};
        //Method 1
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);

        //Method 2
        List<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, array);
        System.out.println(list1);




//        List<Integer> rs=new ArrayList<Integer>();
//        //Collections.addAll(rs, new int[][]{zeros});
//        System.out.println(rs);
//        rs=intersect2(nums);
//        System.out.println(rs);
    }
    static  List<Integer> intersect2(int[][]nums){
        HashMap<Integer,Integer>hm=new HashMap<>();
        ArrayList list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(hm.containsKey(nums[i][j]))
                    hm.put(nums[i][j],hm.get(nums[i][j])+1);
                else
                    hm.put(nums[i][j],1);
            }
        }
        System.out.println(hm);
        for(Integer element:hm.keySet()){
            if(hm.get(element)== nums.length)
                list.add(element);
        }
        Collections.sort(list);
        return list;

    }

    static List<Integer> intersect(int[][]nums){
        ArrayList<Integer> al=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <nums[i].length ; j++) {
                if(set.contains(nums[i][j])){
                    if(!al.contains(nums[i][j]))
                        al.add(nums[i][j]);
                }
                else{
                    set.add(nums[i][j]);
                }
            }
        }
        return al;
    }
}
