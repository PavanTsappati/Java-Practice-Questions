package Data_Structures;
import java.util.*;
public class SubArrays {
	public static void main(String[] args) {
//		int [] arr= {1,2,3,4};
//	    
//	   for(int i=0;i<arr.length;i++)
//	    	{
//	     	for(int j=i;j<arr.length;j++)	
//	    	{
//    			for(int k=i;k<=j;k++)
//    			{
//    				System.out.print(arr[k]+" ");
//    			}
//    			System.out.println();
//    		}
//    	}
		ArrayList<String> as=new ArrayList<>();
		String s="Pavan";
//		int n=s.length();
//		for(int i=0;i<n;i++)
//		{
//			for(int j=i;j<n;j++)
//			{
//				for(int k=i;k<=j;k++)
//				{
//					System.out.print(s.charAt(k));
//				}
//				System.out.println();
//			}
//		}
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				String temp=s.substring(i,j+1);
				as.add(temp);
			}
		}
		System.out.print(as);
		
    }
}
