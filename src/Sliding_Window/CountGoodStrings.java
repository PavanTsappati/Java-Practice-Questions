package Sliding_Window;

import java.util.*;
public class CountGoodStrings {
	public static int cgs (String s)
	{
		HashMap<Character,Integer> Hm = new HashMap<>();
		int ans=0;
		int n=s.length();
		int l=0;
	
	    for(int r=0;r<n;r++)
	    {
	    	char ch=s.charAt(r);
	        Hm.put(ch,Hm.getOrDefault(ch,0)+1);
	        if(r-l==0)
	        {
	        	char temp=s.charAt(l);
	        	Hm.put(temp,Hm.get(temp)-1);
	        	if(Hm.get(temp)==0)
	        	{
	        		Hm.remove(temp);
	        	}
	        	l++;
	        }
	        if(Hm.size()==3)
	        {
	        	ans+=1;
	        }
	    }
		return ans;
	}

	public static void main(String[] args) {
		String s="abccde";
		System.out.println(cgs(s));
	
	}

}
