package Recurssion;
import java.util.*;
public final class Linear_search_using_recurssion {
	static boolean LinearSearchRecurssion(int []arr,int target,int index) {
		if(index==arr.length) {
			return false;
		}
		return arr[index]==target || LinearSearchRecurssion(arr,target,index+1);
	}
	static int LinearSearchUsingRecurssion(int []arr,int target,int index) {
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==target) {
			return index;
		}else {
			return LinearSearchUsingRecurssion(arr,target,index+1);
		}
	}
	
	static ArrayList<Integer> list= new ArrayList<>();
	static void LinearSearchonMultipleOcurrence(int []arr,int target,int index) {
		if(index==arr.length) {
			return;
		}
		if(arr[index]==target) {
			list.add(index);
//			System.out.println(list);
		}
		 LinearSearchonMultipleOcurrence(arr,target,index + 1);
	}
	static void LinearSearchonMultipleOcurrence1(int []arr,int target,int index, ArrayList<Integer>List ) {
		if(index==arr.length) {
			return;
		}
		if(arr[index]==target) {
			list.add(index);
//			System.out.println(list);
		}
		 LinearSearchonMultipleOcurrence1(arr,target,index + 1,List);
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,3,4,6};
//		System.out.println(LinearSearchRecurssion(arr,3,0));
	    LinearSearchonMultipleOcurrence1(arr,3,0,new ArrayList<>());
		System.out.println(list);
	}
}
