package NumberTheoryPrograms;

public class Test1 {

	static int x;
	int a, b;
	static
	{
		x=100;
	}
	Test1(int a, int b)
	{
		this.a=a;
		this.b=b;
		x++;
	}
	void display_nonStatic()
	{
		System.out.println("a :" + a + "\t b :" + b);
		System.out.println(" x: " + (++x));
	}
	static void display_static() {
		System.out.println(" x : " + x--);
	}
	
}
