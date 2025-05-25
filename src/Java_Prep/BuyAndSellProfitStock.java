package Java_Prep;

public class BuyAndSellProfitStock {
	public static int ar (int [] arr)
	{
		int n = arr.length;
		int profit=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int temp =arr[j]-arr[i];
				profit=Math.max(profit,temp);
			}
		}
		return profit;
		
	}
	public static int ar2(int [] arr)
	{
		int n=arr.length;
		int profit=0;
		int low=arr[0];
		for(int i=1;i<n;i++)
		{
			int temp=arr[i]-low;
			profit=Math.max(profit, temp);
			low=Math.min(arr[i], low);		
		}
		return profit;
	}

	public static void main(String[] args) {
		int []ajr= {7,1,5,3,6,10};
		System.out.println(ar(ajr));
		System.out.println(ar2(ajr));
		
	}

}
