package Sliding_Window;
public class GreaterThanThresshold {
public static void main(String[] args) {
		int [] arr= {1,2,3,1,4};
		int n=arr.length;
		int thresshold=7;
		int k=3,l=0,ans=0,temp=0;
		for(int r=0;r<n;r++){
		     temp+=arr[r];
		     if(r-l==k){
		    	 temp-=arr[l];
		    	 l++;
		    }if(r-l+1==k){
		    	if(temp>=thresshold){
			    	 ans++;
			     }
		     }
		}System.out.println(ans); 
	}

}
