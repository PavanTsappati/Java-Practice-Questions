package Sliding_Window;

public class MinimuLengthSubArray {
	public static int MLSA(int []arr,int k)
	{
		int ans=Integer.MAX_VALUE;
		int n=arr.length;
		int l=0;
		int temp=0;
		
		for(int r=0;r<n;r++)
		{
			temp+=arr[r];
			while(temp>=k)
			{
				ans=Math.min(ans, r-l+1);
				temp-=arr[l];
				l++;
			}
		}
		if(ans==Integer.MAX_VALUE)
		{
			return 0;
		}
		return ans;
	}

	public static void main(String[] args) {
		int []arr= {2,3,1,2,4,3};
		int k=7;
		System.out.println(MLSA(arr,k));
	}

}
