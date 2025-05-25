package Java_Prep;
public class MaximumDifferenceBetweenDiffElements {	
	public static int maxi(int[] nums)
	{
		int maxr=-1;
		int n= nums.length;	
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				int a= nums[i];
				int b=nums[j];
				if(a<b){
					int temp=b-a;
					maxr=Math.max(maxr, temp);
				}				
			}
		}
		return maxr;
	}
//	Time complexity of o(n)
	public static int maxi1(int[] numsr)
	{
		int maxr=-1,low=numsr[0];
		int n=numsr.length;		
		for(int i=1;i<n;i++){
			int value=numsr[i];
			if( low<value){				
			maxr=Math.max(maxr, value-low);			
			}
			low=Math.min(value, low);
		}		   
	     return maxr;		
	}
       public static void main(String[] args) {
		
        int [] arr = {7,1,5,4};
        System.out.println(maxi(arr));
        System.out.println(maxi1(arr));
	}

}
