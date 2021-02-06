package testYentra;

public class Test1 {

	public static void main(String[] args) {
		Employee e1=new Employee("Yami", "101");
		Employee e2=new Employee("Yami", "101");
		Employee e3=new Employee("ABC", "102");
		System.out.println(e1);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1.equals(e2));
	}

}
