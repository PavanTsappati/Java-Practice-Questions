package Java_Prep;

public class ReverseInteger {
	public static  String reverse1(int n)
	{
		int reverse=0;
		String s="";
		while(n != 0)
		{
			int pick_last=n % 10;
			s+=Integer.toString(pick_last);
			n/=10;
		}
		return s;
	}
	public static int reverse2(int n)
	{
		int reverse=0,rem;
		while(n != 0)
		{
			rem=n % 10;
			reverse=reverse*10+rem;
			n/=10;
		}
		
		return reverse;
		
	}

	public static void main(String[] args) 
	{
		int r=1234;
		System.out.println("The reversed number "+r+" is "+reverse1(r));
		System.out.println();
		System.out.println("The reversed number of "+r+" is "+reverse2(r));
	}

}
