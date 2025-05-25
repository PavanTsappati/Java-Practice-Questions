package Sliding_Window;
public class SumOfSubArraysSum {
public static void main(String[] args) {
		int [] nums= {1,8,3,7,5,6};
		int l=0,max=0,n=nums.length,k=3,ans=0,temp=0;
		for(int r=0;r<n;r++)
		{
			 temp+=nums[r];
			if(r-l==k)
			{
				temp-=nums[l];
				l++;
			}
			if(r-l+1==k)
			{
				ans=Math.max(ans,temp);
			}
		}System.out.println(ans);
	}
}
