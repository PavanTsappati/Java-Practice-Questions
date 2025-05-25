package Sliding_Window;
import java.util.*;
public class MinimumCOstOfCandies {
	public static int minCostCandies(int[]cost){
		Arrays.sort(cost);
		int ans=0;
		int took=0;
		for(int i=cost.length-1;i>=0;i--) {
			if(took==2){
				took=0;
			}else{
				ans+=cost[i];
				took++;
			}
		}
		return ans;
	}
   public static void main(String[] args) {  	
	   int[] arr= {6,5,7,9,2,2};
	   System.out.println(minCostCandies(arr));
	}
}
