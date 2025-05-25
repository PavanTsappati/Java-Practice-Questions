package Binary_Search;

public class ReturnsTheprecendindexCharacter {
	public static Character bs(char[]arr,char t)	
	{
		int n=arr.length;
		int l=0;
		int r=n-1;
		while(l<=r)
		{
			int m=l+(r-l)/2;
			if(arr[m]>t)
			{
				r=m-1;
			}
			else {
				l=m+1;
			}
		}
		if(r<0)
		{
			return 'a';
		}
		return arr[r];
		
	}

	public static void main(String[] args) {
		char [] arr={'c', 'e', 'g', 'k', 'y'};
		char ans='m';
		System.out.println(bs(arr,ans));

	}

}
