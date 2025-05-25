package Java_Prep;

public class MoveZeroesToEnd {
	public static int [] Movezeroes(int []arr) {
		int index=0;
		int n=arr.length;
		int arr2[]=new int[n];
		for(int i=0;i<arr.length;i++) {
		   int temp=arr[i];
		   if(temp != 0) {
			   arr2[index++]=temp;
		   }
		} while(index<arr.length) {
			arr2[index++]=0;
		}
		return arr2;
		
	}

	public static void main(String[] args) {
		 int[] arr = {0, 1, 0, 3, 12};
		 int [] arr23=Movezeroes(arr);
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(" "+arr23[i]);
		 }
	}

}
