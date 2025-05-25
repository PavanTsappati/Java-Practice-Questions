package Sliding_Window;
import java.util.*;
public class MaximumLengthOfSubStringWithUniqueCharacters {
	public static int MLSSWUC(String s) {
	HashSet<Character> hs= new HashSet<>();
     int n=s.length();
     int ans=0;
     int l=0;
     for(int r=0;r<n;r++){
         char ch=s.charAt(r);
         if(!hs.contains(ch)){
             hs.add(ch);
         }else{
             while(hs.contains(ch)){
                 hs.remove(s.charAt(l));
                 l++;
             }
             hs.add(ch);
         }
         ans=Math.max(ans,r-l+1);
     }return ans;     
	}
	public static void main(String[] args) {
		System.out.println(MLSSWUC("abcbbb"));
	}
}
