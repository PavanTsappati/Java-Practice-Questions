package Binary_Search;

public class FindTheSmallestDivisorInGIvenThreshold {
	 public static boolean isPossible(int [] nums,int threshold,int m){
	        for(int i=0;i<nums.length;i++){
	            int upper = nums[i] / m;
	            if(nums[i] % m != 0) {
	                upper++;
	            }
	           threshold=threshold-upper;
	           if (threshold < 0){
	                return false;
	            }
	        } return true;
	    }
	 public static int smallestDivisor(int[] nums, int threshold) {
	       int l=1;
	     int r=(int)Math.pow(10,6);
	     while(l<=r) {
	         int mid=l+(r-l)/2;
	         if(isPossible(nums,threshold,mid)){
	             r=mid-1;
	         }else{
	             l=mid+1;
	         }
	       } return l;
	    }
	   public static void main(String[] args) {
		   int[]arr= {1,2,5,9};
		   System.out.println(smallestDivisor(arr,6));
	 }
 }
	