package Sliding_Window;

public class NoOfexactsubArrayswithExactOddNumbers {
	 public static int atmost(int [] arr,int k){
	        int l=0;
	        int n=arr.length;
	        int ans=0;
	        int temp=0;
	        for(int r=0;r<n;r++){
	            if(arr[r]%2==1){
	                temp++;
	            }
	            while(temp>k){
	                if(arr[l]%2==1){
	                    temp--;
	                }
	                l++;
	            }
	            ans+=r-l+1;
	        }return ans;
	    }

	public static void main(String[] args) {
		int []nums= {1,0,1,0,1};
		int k=2;
		int ans=atmost(nums,k)-atmost(nums,k-1);
		System.out.println(ans);
		
	}

}
