package Data_Structures;

import java.util.HashMap;

public class FrequencyOfIntegersUsingHahMaps {

	public static void main(String[] args) {
		HashMap <Integer,Integer> Boom = new HashMap<>();
		   int [] arr= {1, 5, 8, 0, 1, 8, 1, 5, 1};    
		   int l=arr.length;
		   for(int i=0;i<l;i++)
		   {
			   int n= arr[i];
			   if(Boom.containsKey(n))
			   {
				   int prev = Boom.get(n);
				   Boom.put(n, prev+1);
			   }
			   else
			   {
				   Boom.put(n,1);
			   }
		   }  
		    
		   for(int raja:Boom.keySet())
		     {
		    	 System.out.println(raja+" -> "+Boom.get(raja));
		     }
	}

}
