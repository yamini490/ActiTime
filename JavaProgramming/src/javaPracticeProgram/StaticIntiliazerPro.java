package javaPracticeProgram;

public class StaticIntiliazerPro {

	 static int test()
	{
		System.out.println("Test Begin");
		
		System.out.println(" i :"+ i);
		
		System.out.println(" Test End");
		
		
		return 10;
		
	}
	
	static int i=test();
	public static void main(String[] args) {
		System.out.println("Main Begin");
		
	System.out.println(i);
	
		test();
		
		System.out.println("Main End");
	}

}
