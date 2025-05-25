package Data_Structures;
import java.util.HashMap;
public class DecodeTheMessageUsingHashMap {

	public static void main(String[] args) {
		HashMap <Character,Character> hm =new HashMap<>();
		int n=97;
		String key="the quick brown fox jumps over the lazy dog";
		String message="vkbs bs t suepuv";
		for(int i=0;i<key.length();i++){
			char ch=key.charAt(i);
			if(ch != ' ' && !hm.containsKey(ch)){
				hm.put(ch, (char)n);
				n++;
			}
		}
		String ans="";
		for(int i=0;i<message.length();i++){
			char ch=message.charAt(i);
			if(ch != ' '){
				ans+=hm.get(ch);
			}else{
				ans+=' ';
			}
		} System.out.println(ans);
	}

}
