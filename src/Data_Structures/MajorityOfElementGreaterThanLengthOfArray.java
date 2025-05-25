package Data_Structures;
import java.util.Arrays;
import java.util.HashMap;
public class MajorityOfElementGreaterThanLengthOfArray {
	
	public static int enjoy (int [] arr) 
	{
		HashMap <Integer,Integer> boom= new HashMap<>();
		int ans=-1;
		for(int i=0;i<arr.length;i++){
			{
			    boom.put(arr[i],boom.getOrDefault(arr[i],0)+1);
			}
			int n=arr.length/2;
			for(int raja:boom.keySet())
			{
				if(boom.get(raja)>n)
				{
					return raja;
				}
			}
		}
		return ans;
	}
	public static int enjoy2(int[] arr)
	{
		Arrays.sort(arr);
		int n=arr.length/2;
		return arr[n];
	}
	public static void main(String[] args) {
		int [] arr= {3,2,3};
		System.out.println(enjoy(arr));
	    System.out.println(enjoy2(arr));
	}

}
