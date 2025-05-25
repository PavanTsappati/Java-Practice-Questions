package Java_Prep;
import java.util.Scanner;
public class Table4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		for(int i=1;i<=c;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}

	}

}
