package Stack;
import java.util.*;

public class ReversingStringUsingStack {

	public static void main(String[] args) {
		String s= "Pavan";
		Stack<Character> st =new Stack<>();
		for(int i=0;i<s.length();i++) {
			st.push(s.charAt(i));
		}
		StringBuilder ans = new StringBuilder();
		while(!st.isEmpty()) {
			ans.append(st.pop());
		}
		System.out.println(ans.toString());

	}

}
