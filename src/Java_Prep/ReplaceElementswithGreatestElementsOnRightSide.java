package Java_Prep;

import java.lang.reflect.Array;

//Input: arr = [17,18,5,4,6,1]
//Output: [18,6,6,6,1,-1]
public class ReplaceElementswithGreatestElementsOnRightSide{
	public static int[] replaceElements(int []arr){
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int max=-1;
			for(int j=i+1;j<n;j++){
			   	max=Math.max(arr[j], max);
			}
			arr[i]=max;
		}
		return arr;
	}
	public static int[] replaceElements2(int []arr){
		int n=arr.length;
		int rightMax=-1;
		for(int i=n-1;i>=0;i--){
			int prev=arr[i];
			arr[i]=rightMax;
			rightMax=Math.max(rightMax, prev);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int [] arey= {17,18,5,4,6,1};
		int n=arey.length;

		int [] storage2=replaceElements2(arey);
		for(int i=0;i<n;i++){
			System.out.print(storage2[i]+",");
			
			}
	}

}
