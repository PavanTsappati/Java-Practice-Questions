package Sliding_Window;
import java.util.*;
public class MinimumDIfferenceBetweenHighestAndLowestofK {
	public static int minimumDifference(int [] arr,int k)
	{
		Arrays.sort(arr);
		int ans=Integer.MAX_VALUE;
		int l=0;
		int n=arr.length;
		for(int r=0;r<=n-k;r++)
		{
			int i=r+k-1;
			int temp=arr[i]-arr[r];
			ans=Math.min(ans, temp);
		}
		
		return ans;
	}
	 public static int minimumDifference2(int[] arr,int k)
	 {
		 Arrays.sort(arr);
		 int ans=Integer.MAX_VALUE;
		 int l=0;
		 int n=arr.length;
		 for(int r=0;r<=n-k;r++)
		 {
//			 int temp=arr[i];
			 if(r-l==k)
			 {
				 l++;
			 }
			 if(r-l+1==k)
			 {
				 int temp=arr[r]-arr[l];
				 
				 ans=Math.min(ans,temp);
			 }
		 }
		 return ans;
	 }
	public static void main(String[] args) {
	int[] arr= {9,4,1,7};
	//System.out.println(minimumDifference(arr,3));
	System.out.println(minimumDifference2(arr,2));

	}

}
