package NumberTheoryPrograms;

public class TestDriver {

	public static void main(String[] args) {
		Test2.display_static();
		Test2 t1=new Test2(40, 50);
		t1.display_nonStatic();
		t1.display_static();
		
		Test1 t2=new Test2(10, 20);
		t1.display_nonStatic();
		t2.display_nonStatic();
		t2.display_static();

	}

}
