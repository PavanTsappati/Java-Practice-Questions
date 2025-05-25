package Binary_Search;

public class LeftMostAndRightMostOfRepeatedCharactersInBinarysearch {
	
	public static int left(int []arr,int target) {
		int n=arr.length;
		int l=0;
		int r=n-1;
		while(l<=r)
		{
			int m=l+(r-l)/2;
			if(arr[m]>=target)
			{
				r=m-1;
			}
			else
			{
				l=m+1;
			}
		}
		return l;
	}

	public static int right(int []arr,int target) {
		int n=arr.length;
		int l=0;
		int r=n-1;
		while(l<=r)
		{
			int m=l+(r-l)/2;
			if(arr[m]>target)
			{
				r=m-1;
			}
			else
			{
				l=m+1;
			}
		}
		return r;
	}

	public static void main(String[] args) {
	    int []arr= {1,3,3,3,3,5};
	    System.out.println(left(arr,3));
	    System.out.println(right(arr,3));
	}

}
