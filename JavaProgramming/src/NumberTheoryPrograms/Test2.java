package NumberTheoryPrograms;

public class Test2 extends Test1 {

	static int y;
	static
	{
		y=200;
	}
		
	Test2(int a, int b) {
		super(a, b);
		y++;
		x--;
	}

	void display_nonStatic()
	{
		super.display_nonStatic();
		System.out.println(" y: "+ y--);
	}
	
	static void display_static() {
		
		Test1.display_static();
		System.out.println(" y : " + y);
		
	}
	
	
}
