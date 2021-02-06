package testYentra;

public class Employee implements Comparable{
String name;
String e_id;
// constructor
public Employee(String name, String e_id) {
	
	this.name = name;
	this.e_id = e_id;
}
// Overridden toString()
public String toString() {
	return "Employee name :" + name + " , e_id :" + e_id;
}


//Overridden hashCode()
//public int hashCode()
//{
//	
//	return name.hashCode()+e_id.hashCode();
//	
//}
//Overridden equals()
public boolean equals(Object o)
{
	Employee e=(Employee) o;
	return this.name.equals(e.name) && this.e_id.equals(e.e_id);	
}

public void printDetails()
{
	System.out.println("Employee name :"+ name);
	System.out.println("Employee id :"+ e_id);
}
public int compareTo(Object o)
{
	Employee e=(Employee)o;
	if(this.e_id.equals(e.e_id)) // to find both string are equals we use equals method [NOT with length]
	{
		return 0;
	}
	else if(this.e_id.length() > e.e_id.length()) // here eid is a String so we compare with length method
	{
		return 1;
	}
	else
		return -1;
}
}
