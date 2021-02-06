package testYentra;

import java.util.HashSet;

public class HasetForEmployeeObjects {

	public static void main(String[] args) {
		
		HashSet<Employee> hs=new HashSet<>();
		hs.add(new Employee("Yami","101") );
		hs.add(new Employee("Yami","101") );
		hs.add(new Employee("Abc","102") );
		hs.add(new Employee("Xyz","103") );
		hs.add(new Employee("Lmn","104") );
		System.out.println(hs);
		
	}

}
