package Recurssion;

public class Reverse_Palindrome_using_recurssion {
	 static int helper(int n,int digits) {
		if(n % 10==n) {
			return n;
		}
		int rem=n % 10;
		return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
	}
	static int reverse(int n) {
		int digit=(int)(Math.log10(n))+1;
		return helper(n,digit);
	}
	static Boolean Palindrome(int n) {
		return (n==reverse(n));
	}

	public static void main(String[] args) {
		System.out.println(reverse(1234));
		System.out.println(Palindrome(121));
	}

}
