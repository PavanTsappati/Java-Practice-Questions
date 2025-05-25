package Recurssion;

public class Fibinocci_Series {
	public static int fibo(int n) {
		if(n<2) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}

	public static void main(String[] args) {
		int n=fibo(6);
		System.out.println(n);
	}

}
