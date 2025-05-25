package Linked_List;
import java.util.LinkedList;

public class Shopping_Cart {
    	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("ice APPLE");
		
		list.addFirst("Mango");
		System.out.println(list.removeLast()+" (removes last");
		System.out.println(list.removeFirst()+" removes First");
		System.out.println(list.get(2)+"2");
		System.out.println(list.getFirst()+" get first");
		System.out.println(list.getLast()+" get last");
		
		System.out.println(list);
		System.out.println(list.size());
		list.clear();
		System.out.println(list.isEmpty());  
		System.out.println(list );  
	}
}
