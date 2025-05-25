package Data_Structures;

import java.util.HashMap;

public class Hashmaps {

	public static void main(String[] args) {
		
        HashMap <Integer,Integer> Macha=new HashMap<>();
        Macha.put(2, 5);
        
        Macha.put(8, 24);
        
        Macha.put(14, 5);
        
        Macha.put(7, 6);
        
        int n=7;
        
        if(Macha.containsKey(n))
        {
        	int prev=Macha.get(n);
        	Macha.put(n, prev+1);
        	System.out.println(Macha.get(n));
        }
        else
        {
        	Macha.put(n, 6);
        }
       
        for(int boom:Macha.keySet()) {
        	System.out.println(boom+":"+Macha.get(boom));
        }
	}
}
