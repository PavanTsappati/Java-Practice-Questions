package Sliding_Window;

public class HighestSumOfSubArrays {

	public static void main(String[] args) {
			int [] arr= {5 ,9 ,1 ,8 ,7};
			int n=arr.length;
			int ans=0;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
	                int temp=0;
					for(int k=i;k<=j;k++){
						temp+=arr[k];
					}
					ans=Math.max(ans, temp);					
				}
			}
			System.out.println(ans);

		}
}

