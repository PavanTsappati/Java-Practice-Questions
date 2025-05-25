package Sliding_Window;

public class AnimuthyamSubArrayssum {
public static void main(String[] args) {
		String s="abcde";
		int n=s.length();
		int k=3;
		int ans=0,l=0,temp=0;
		for(int r=0;r<n;r++){
			temp+=s.charAt(r);
		if(r-l==k){
			temp=temp-s.charAt(l);
			l++;
		}if(r-l+1==k){
    		ans =Math.max(ans, temp);
    	}
	    }System.out.println("Highest Sum : "+ans);
    }
}
