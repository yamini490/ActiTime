package interviewQuesNAL;
// swap two numbers
public class JP6 {
 
	public static void main(String[] args) {
		int a=35;
		int b=55;
		System.out.println("Before Swaping :");
		System.out.println(" a : " + a);
		System.out.println(" b : " + b);
		System.out.println(" After swaping :");
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println(" a : " + a);
//		System.out.println(" b : " + b);		
// Without temp var:
		a= a-b;
		b=a+b;
		a=b-a;
		System.out.println(" a : " + a);
		System.out.println(" b : " + b);
		
	}

}
