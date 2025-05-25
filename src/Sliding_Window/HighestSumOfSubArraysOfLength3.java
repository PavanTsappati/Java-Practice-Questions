package Sliding_Window;

public class HighestSumOfSubArraysOfLength3 {

	public static void main(String[] args) {
		int [] arr= {5 ,9 ,1 ,8 ,7};
		int n=arr.length;
		int sl=3;
		int ans=0;
		for(int i=0;i<=n-sl;i++)
		{
			int j=i+sl-1;
			int temp=0;
            for(int k=i;k<=j;k++)
            {
            	temp+=arr[k];
            }
            ans=Math.max(ans, temp);
		}
		System.out.println(ans);

	}

}
