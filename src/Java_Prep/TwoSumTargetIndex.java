package Java_Prep;

import java.util.*;
class TwoSumTargetIndex{
    public static int []Finds(int [] nums,int target){
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(map.containsKey(comp)){
                int result [] = new int [2];
                result[0]=map.get(comp);
                result[1]=i;
                return result;
                }
                map.put(nums[i],i);
        } return new int[] {};
    }
    public static void main(String[]args){
        int [] nums={1,2,3,6,5};
        int target=5;
        int result [] = Finds(nums,target);
        System.out.println(result[0]+","+result[1]);
    }
}