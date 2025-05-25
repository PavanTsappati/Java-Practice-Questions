package Sliding_Window;
import java.util.*;

public class FruitsIn2Baskets {
	public static int Fruit(int [] fruits)
	{
		HashMap<Integer,Integer> hm=new HashMap<>();
		int ans=0;
		int l=0,temp=0;
		for(int r=0;r<fruits.length;r++)
		{
			temp=fruits[r];
			hm.put(temp,hm.getOrDefault(temp,0)+1);
			while(hm.size()>2) {
				int val=fruits[l];
				hm.put(val,hm.get(val)-1);
				if(hm.get(val)==0) {
					hm.remove(val);
				}
				l++;
			}
			ans=Math.max(ans, r-l+1);
		}
		
		return ans;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,1};
		System.out.println(Fruit(arr));
	}

}
