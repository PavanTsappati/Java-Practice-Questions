package Binary_Search;

public class FindingIndexWherewecanaddnewelement {
	public static int bs(int[]arr,int a) {
		int l=0;
		int r=arr.length-1;
		while(l<=r) {
			int m=l+(r-l)/2;
			 if(arr[m]>a) {
				r=m-1;
			}
			else {
				l=m+1;
			}
			System.out.println(r+" "+l);
		}return l;
	}

	public static void main(String[] args) {
	    int []arr= {1,3,5,7,8};
	    System.out.println(bs(arr,9));
	    
	}

}
