package StringPrograms;

import java.util.HashMap;

public class P24 {

	public static void main(String[] args) {
		String str = "abcdabceabcf";
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}

		System.out.println(hm);
		// Repeated characters
//		System.out.println("Repeated characters : -- >");
//		for (char c : ch) {
//			if (hm.get(c) > 1) {
//				System.out.println(c);
//				
//			}
//		}
//		System.out.println("Non Repeated characters : -- >");
//			for (char ci : ch) {
//				if (hm.get(ci) == 1) {
//					System.out.println(ci);
//					
//				}
//			}
		
		
			
			
			
			

		
		
		
		
	}
}