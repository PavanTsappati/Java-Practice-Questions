package Binary_Search;

public class FirstAndLastElementOfSortedArray {
	 public static int leftmost(int [] arr,int k){
	        int l=0;
	        int r=arr.length-1;
	        while(l<=r){
	            int m=l+(r-l)/2;
	            if(k<=arr[m]){
	                r=m-1;
	            }
	            else{
	                l=m+1;
	            }
	        }
	        if (l >= arr.length){
                return -1;
            }
	         if(arr[l] != k){
	                return -1;
	            }
	            
	            return l;
	    } 
	    public static int rightmost(int [] arr,int k){
	        int l=0;
	        int r=arr.length-1;
	        while(l<=r){
	            int m=l+(r-l)/2;
	            if(k<arr[m]){
	                r=m-1;
	            }
	            else{
	                l=m+1;
	            }
	        } 
	        if (r<0){
                return -1;
            }
	         if(arr[r] != k){
	                return -1;
	            }
	            
	            return r;
	    }
	    public static int[] searchRange(int[] nums, int target) {
	       int lm=leftmost(nums,target);
	       int rm=rightmost(nums,target);
	       int [] ans={lm,rm};
	       return ans;
	    }
public static void main(String[] args) {
	
         int [] arr= {5,7,7,8,8,10};
         int []ans=searchRange(arr,6);
         for(int i=0;i<2;i++) {
         System.out.println(ans[i]);
         }
	}

}
