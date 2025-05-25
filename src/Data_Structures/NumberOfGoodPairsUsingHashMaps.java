package Data_Structures;
import java.util.HashMap;
public class NumberOfGoodPairsUsingHashMaps {
	
	public static int GoodPairs1(int []arr)
	{
		HashMap <Integer,Integer> Hm = new HashMap<>();		
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
//			Hm.put(arr[i],Hm.getOrDefault(arr[i],0)+1);
			if(Hm.containsKey(arr[i])){
				ans=ans+Hm.get(arr[i]);
			
				Hm.put(arr[i],Hm.getOrDefault(arr[i],0)+1);
				
			}
			else
			{
				Hm.put(arr[i],1);
			}
		}
		return ans;
	}
	public static int GoodPairs(int [] nums)
	{
		HashMap <Integer,Integer> HM =new HashMap<>();
		int n= nums.length;
		int ans=0;
		for(int i=0;i<n;i++)
		{
		   HM.put(nums[i],HM.getOrDefault(nums[i],0)+1);	
		}
		for(int Boom:HM.keySet())
		{
			 int val=HM.get(Boom);

			int temp=val*(val-1)/2;
//			System.out.println(">"+temp);
			ans+=temp;
		}
		return ans;
	}

	public static void main(String[] args) 
	{
		int[] arr= {1,2,1,1,1};
		int n=GoodPairs(arr);
		System.out.println(n+">");
		int n1=GoodPairs1(arr);
		System.out.println(n1);
	}

}
