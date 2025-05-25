package Sliding_Window;

import java.util.*;
public class ArrayPartitionUsingSlidingWindows {
	
    public static int arraypartition(int []nums){
    	int ans=0;
    	Arrays.sort(nums);
    	for(int i=0;i<nums.length;i+=2){
    		int temp=nums[i];
    		ans+=temp;
    	}
    	return ans;
    }
	public static void main(String[] args) {
		int [] arr= {1,2,3,4};
		System.out.println(arraypartition(arr));
		
	}

}
