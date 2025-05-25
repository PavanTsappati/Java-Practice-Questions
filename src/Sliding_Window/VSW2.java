package Sliding_Window;

public class VSW2 {

	public static void main(String[] args) {
		int [] arr= {12,1,3,1,1,6,7,1,8,1};
		int max=0,temp=0,l=0,n=arr.length,k=2;
		for(int r=0;r<n;r++)
		{
			if(arr[r] % 2 == 1)
			{
				temp++;
			}
			while(temp>k)
			{
			   if(arr[l] % 2 == 1)
			   {
				   temp--;
			   }
			   l+=1;
			}
			max=Math.max(max, r-l+1);
			
		}
		System.out.print(max);

	}
}
