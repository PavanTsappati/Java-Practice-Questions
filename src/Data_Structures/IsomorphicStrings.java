package Data_Structures;

import java.util.HashMap;

public class IsomorphicStrings {
	
	public static boolean isomorphic(String s,String t)
	{
		boolean status =true;
		HashMap<Character,Character> hm = new HashMap <>();
		HashMap<Character,Character> rev = new HashMap <>();
		for(int i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			char ch2=t.charAt(i);
		    if(!hm.containsKey(ch1) && !rev.containsKey(ch2))
		    {
		    	hm.put(ch1,ch2);
		    	rev.put(ch2, ch1);
		    }
		    else if(hm.containsKey(ch1) && hm.get(ch1) != ch2)
		    {
		    	status =false;
		    	break;
		    }
		    else if (rev.containsKey(ch2) && rev.get(ch2) != ch1)
		    {
		    	status = false;
		    	break;
		    }
		}
		return status;
	  }

       	public static void main(String[] args) 
	   {
		String s="abcdef";
		String t="ghijkl";
		System.out.println(isomorphic(s,t));
	  } 

}
