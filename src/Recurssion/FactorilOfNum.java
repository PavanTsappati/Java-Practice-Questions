package Recurssion;

public class FactorilOfNum {
	static int factorial(int n) {
		if(n<=1) {
			return 1;
		}                                        
		return n* factorial(n-1);
	}

	static int sum(int n) {
		if(n<=1) {
			return 1;
		}
		return n+sum(n-1);
	}
	public static void main(String[] args) {
		int n=factorial(5);
		int s=sum(5);
	    System.out.println(n);
	    System.out.println(s);
	}

}
