package Java_Prep;
import java .util.Arrays;
public class BubbleSort {
	public static int [] ArraysSort(int []arr)
	{
		Arrays.sort(arr);
		return arr;
	}
	
	public static int [] BubbleAscendingOrder(int []arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			boolean swap=false;
			for(int j=0;j<n-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	
					swap=true;
				}
			}
			if(swap==false) {
				break;
			}
		}
		return arr;
	}
public static int [] BubbleDecendingOrder(int []arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			boolean swap=false;
			for(int j=0;j<n-1-i;j++){
				if(arr[j]<arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	
					swap=true;
				}
			}
			if(swap==false) {
				break;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
    	int [] arr= {10,1,2,3,4,5,6,7};
    	int [] arr4=ArraysSort(arr);
	     for(int i=0;i<arr.length;i++)
	     {
	        	System.out.print(arr4[i]+",");
		 }
	     
	     System.out.println();
	     System.out.println();
	     
		int [] arr2 = BubbleAscendingOrder(arr);
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr2[i]+",");
	    }
		
		System.out.println();
		System.out.println();
		
	     int [] arr3 = BubbleDecendingOrder(arr);
	     for(int i=0;i<arr.length;i++)
	     {
        	System.out.print(arr3[i]+",");
	     }	
    }
}
