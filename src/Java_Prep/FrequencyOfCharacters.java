package Java_Prep;

public class FrequencyOfCharacters {

     public static void main(String[]args) {
    	 int [] arr= {1,2,3,1,2,3,4,5,};
    	 int n=arr.length;
    	 int [] freq=new int[n];
    	 for(int i=0;i<n;i++) {
    		 freq[i]=1;
    	  
    		 for(int j=i+1;j<n;j++) {
    			 if(arr[i]==arr[j]) {
    				 freq[i]++;
    			 }
    		 }
    	 }
    	 for(int i=0;i<n;i++) {
    		 System.out.println(arr[i]+" "+freq[i]);
    	 }
     }

}
