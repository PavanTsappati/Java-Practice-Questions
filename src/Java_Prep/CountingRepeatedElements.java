package Java_Prep;

public class CountingRepeatedElements {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,1,2,3,5,6,};
		int n=arr.length;
		int count =0;
	    int [] arr2= new int[n];
	    for(int i=0;i<n;i++) {
	    	arr2[i]=count;
	    }
	     for(int i=0;i<n;i++) {
	    	 for(int j=0;j<n;j++) {
	    		 if(arr[i]==arr[j]) {
	    			 count++;
	    		 }
	    	 }
	     }

	}

}
