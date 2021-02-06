package collectionsss;

import java.util.HashSet;
import java.util.TreeSet;

public class RetainExample {

	public static void main(String[] args)
	{
		TreeSet<String> hs=new TreeSet<>();
		
		hs.add("Green");
		hs.add("Blue");
		hs.add("Yellow");
		hs.add("Orange");
		hs.add("White");
		hs.add("Black");
		
		Object clone = hs.clone();
		System.out.println(clone); 
		
		System.out.println(hs);
		TreeSet<String> hsC=new TreeSet<>();
		hsC.add("White");
		hsC.add("Black");
		hsC.add("Green");
		
		hs.retainAll(hsC);
		
		
		hs.clear();
		System.out.println(hs);
	}
	
}
