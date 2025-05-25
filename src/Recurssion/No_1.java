package Recurssion;

public class No_1 {
	static void fun(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		fun(n-1);
	}
	static void funrev(int n) {
		if(n==0) {
			return;
		}
		funrev(n-1);
		System.out.println(n);
	}
	static void funBoth(int n) {
		if(n==0) {
			return;
		}
		
		funBoth(n-1);
		
	}
	static int sum=0;
	static void reverse(int n) {
		if(n==0) {
			return;
		}
		int rem=n %10;
		sum=sum*10+rem;
		reverse(n/10);
		
	}
	public static void main(String[] args) {
		funBoth(5);
		  reverse(1234);
		  System.out.println(sum); 
	}
}
