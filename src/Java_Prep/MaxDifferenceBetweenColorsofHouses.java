package Java_Prep;

public class MaxDifferenceBetweenColorsofHouses {
	public static int Difference(int [] colors) {
		int n=colors.length;
		int max=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(colors[i] != colors[j]){
			         int temp=j-i;
			         max=Math.max(max, temp);
			         System.out.println(max);
			}				
		}
	}
		return max;
}
	public static int Difference2(int [] colors){
		int n=colors.length;
		int max=0;
		for(int i=0;i<n-1;i++){
			if(colors[i] != colors[n-1]){
			  max=Math.max(max, n-1-i);
			  break;
			}
		}
		for(int j=n-1;j>=0;j--) {
			if(colors[0] != colors[j]){
				max=Math.max(max, j);
			}
		}
	    	return max;
	}

	public static void main(String[] args)
	{
		int [] arr= {1,1,1,6,1,8,1};
		System.out.println(Difference(arr));
		System.out.println();
		System.out.println(Difference2(arr));
	}

}
