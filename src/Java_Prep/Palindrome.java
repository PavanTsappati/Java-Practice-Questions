package Java_Prep;

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args)
	{
		
		       int d;
		       Scanner sc=new Scanner(System.in);
		       System.out.print("Enter the number :");
		       d=sc.nextInt();
		       int reverse=0,remainder;
		       for(int i=0;i<d;i++)
		       {
		           remainder = d % 10;
		           reverse=reverse*10+remainder;
		           d/=10;
		       }
		       System.out.print(reverse);
    }
		

	}


