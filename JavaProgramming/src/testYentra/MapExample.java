package testYentra;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		HashMap<String , String> hm=new HashMap<>();
		hm.put("Name", "Yamini");
		hm.put("Employee Id", "4871");
		hm.put("Location", "Bangalore");
		hm.put("Salary", "80000");

		System.out.println(hm.get("Employee Id"));
		System.out.println(	hm.entrySet());
		
	
		//Set<String> keys = hm.keySet();
			
		
		
		Set<Entry<String, String>> details = hm.entrySet();

		for(Object o : details)
		{
			System.out.println(o);
		}
		String strr="Name=Yamini";
	
	strr.indexOf("=");
		
	}
	
	
	
}