package Data_Structures;

import java.util.HashMap;
public class JewelsndStonesUsingHashMapa {
	public static int numJewelsInStones(String jewels,String stones)
	{
		HashMap <Character,Integer> hm = new HashMap<>();
		int ans=0;
		for(int i=0;i<stones.length();i++)
		{
			char ch=stones.charAt(i);
			hm.put(ch, hm.getOrDefault(ch,0)+1);
		}
		for(int i=0;i<jewels.length();i++)
		{
			char ch =jewels.charAt(i);
			if(hm.containsKey(ch))
			{
				ans+=hm.get(ch);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		
       String  arr= "aA";
       String  arr2= "aAAbbbb";
       int n=numJewelsInStones(arr,arr2);
       System.out.print(n);
	}

}
