package Recurssion;

public class Sum_Of_Digits {
	static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return (n %10)+sum(n/10);
	}
	static int product(int n) {
		if(n % 10==n) {
			return n;
		}
		return (n%10)*product(n/10);
	}

	public static void main(String[] args) {
		int n=sum(555);
		int p=product(555);
		System.out.println(n);
		System.out.println(p);
	}

}
