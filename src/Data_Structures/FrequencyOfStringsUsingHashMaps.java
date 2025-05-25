package Data_Structures;

import java.util.*;
public class FrequencyOfStringsUsingHashMaps {

	public static void main(String[] args) {
	HashMap <String,Integer> str= new HashMap<>();
        
        String [] arr= {"Hello","boblo","Hello","tata"};
        int L =arr.length;
        for(int i=0;i<L;i++)
        {
        	String n=arr[i];
//        	if(str.containsKey(n)){
//        		 int prev=str.get(n);
//        		 str.put(n,prev+1);       		 
//        	}
//        	else
//        	{
//        		str.put(n,1);
//        	}    
        	str.put(n, str.getOrDefault(n,0)+1);
        }
         for(String Boom :str.keySet())
         {        	 
        	 System.out.println(Boom+" -> "+str.get(Boom));
         }
        
     }

}
