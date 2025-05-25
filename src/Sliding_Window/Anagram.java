package Sliding_Window;

import java.util.*;
public class Anagram {
	public static boolean fun(HashMap<Character,Integer> hm,HashMap <Character,Integer> hm1) 
	{
		if(hm.size() != hm1.size())
		{
			return false;
		}
		for(char key:hm.keySet()) {
			if(!hm1.containsKey(key)) {
				return false;
			}
			int a=hm.get(key);
			int b=hm1.get(key);
			if( a != b)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		HashMap<Character,Integer> hm= new HashMap<>();
		HashMap<Character,Integer> hm1=new HashMap<>();
		String s="abcd";
		String s1="abed";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			hm.put(ch,hm.getOrDefault(ch,0)+1);
		}
		for(int i=0;i<s1.length();i++)
		{
			char ch1=s1.charAt(i);
			hm1.put(ch1,hm1.getOrDefault(ch1,0)+1);	
		}
		System.out.println(fun(hm,hm1));

	}

}
