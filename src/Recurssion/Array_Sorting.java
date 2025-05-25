package Recurssion;

public class Array_Sorting {
	public static Boolean recurssionsort(int []arr,int index) {
		if(index==arr.length-1) {
			return true;
		}
		return arr[index]<arr[index+1] && recurssionsort(arr,index+1);
	}
	public static Boolean arraysbrutesorts(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			int temp=arr[i];
			if(!(arr[i]<arr[i+1])) {
				return false;
			}
		} return true;
	}

	public static void main(String[] args) {
	   int[] arr= {1,2,3,4,6};
	   System.out.println(recurssionsort(arr,0));
	}

}
