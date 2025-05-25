package Java_Prep;
public class TwoSum {
	 public static int[] twoSum(int[] nums, int target) {
		 int [] a=new int[2];
		 int n=nums.length;
	        for(int i=0;i<n-1;i++){
	            for(int j=i+1;j<n;j++){
	                if(nums[i]+nums[j]==target){
	                   a[0]=i;
	                   a[1]=j;
	                }
	            }
	        }
	        return a;
	 }
	public static void main(String[] args) {
	int [] arr= {1,2,4};
    int target=6;   
    int [] n=twoSum(arr,6);
       for(int i=0;i<n.length;i++){
    	   System.out.print(n[i]+" ");
       }		 
	}
}
