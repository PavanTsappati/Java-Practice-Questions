package Data_Structures;

public class ReverseintegerMediumProblem {
	 public static int reverse1(int x) {
	        int n=x;
	        int reverse=0,rem;
	        while(n != 0)
	        {
	            rem= n % 10;
	            reverse=(reverse*10)+rem;
	            n=n/10;
	       }
	       if(reverse<Integer.MIN_VALUE || reverse>Integer.MAX_VALUE-1){
	            return 0;
	       }
	       else{
	        return reverse;
	       }
	        
	    }

	public static void main(String[] args) {
		System.out.println(reverse1(1534236469));
		System.out.println(Integer.MAX_VALUE+" "+Integer.MIN_VALUE);
		
	}

}
