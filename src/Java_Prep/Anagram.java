package Java_Prep;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	static boolean isAnagram(String str1,String str2){
		String s1=str1.replaceAll("[//s]","");
		String s2=str2.replaceAll("[//s]","");
		boolean status=true;
		if(s1.length() != s2.length()){
			return false;
		}else{
			char[] a1=s1.toLowerCase().toCharArray();
			char[] a2=s2.toLowerCase().toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			status=Arrays.equals(a1, a2);
		}
		return status;		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st String :");
		String str1=sc.next();
		System.out.print("Enter the 2nd String ");
		String str2=sc.next();
		boolean status=isAnagram(str1,str2);
		if(status==true){
			System.out.print(str1+","+str2+" are Anagram");
		}
		else{
			System.out.print(str1+","+str1+" aren't Anagram");
		}
	}
}