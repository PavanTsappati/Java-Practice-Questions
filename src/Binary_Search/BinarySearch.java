package Binary_Search;

public class BinarySearch {
	 public static int search(int[] nums, int target) {
	        int n=nums.length;
	        int l=0;
	        int r=n-1;
	        while(l<=r){
	            int mid=l+(r-l)/2;
	            if(nums[mid]==target){
	                return mid;
	            }
	            else if(nums[mid]<target){
	               l=mid+1;
	            }
	            else{
	               r=mid-1;
	            }
	        } return -1;
	    }

	public static void main(String[] args) {
		int []arr= {-1,0,3,5,9,12};
		int k=9;
		System.out.println(search(arr,k));

	}

}
