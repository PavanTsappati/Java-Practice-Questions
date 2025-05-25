package Java_Prep;
import java.util.Scanner;
public class inputArray {
public static void main(String[] args){
	    Scanner sc= new Scanner(System.in);
		int n=5;
//		int [] arr= new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		for(int i=0;i<n;i++) {
//			System.out.print(arr[i]);
//		}
		String[] s=new String[n];
		for(int i=0;i<n;i++) {
			s[i]=sc.nextLine();
		}
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
  }
}
