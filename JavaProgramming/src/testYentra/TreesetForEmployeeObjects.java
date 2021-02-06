package testYentra;

import java.util.TreeSet;

public class TreesetForEmployeeObjects {

	public static void main(String[] args) {
		TreeSet<Employee> ts=new TreeSet<>();
		ts.add(new Employee("Yami","101") );
		ts.add(new Employee("Yami","102") );
		ts.add(new Employee("Xyz","103") );
		ts.add(new Employee("Lmn","103") );
		
		System.out.println(ts);
	}

}
