package NumberTheoryPrograms;

public class PrintAscendingOrder3Num1 {

	public static void main(String[] args) {
		int a = 30, b = 20, c = 10;
		//if a is smaller
		if (a < b && a < c) {
			if (b < c) {
				System.out.println(a + " , " + b + " , " + c);
			} else
				System.out.println(a + " , " + c + " , " + b);
		}
		//if b is smaller
		if (b < a && b < c) {
			if (a < c) {
				System.out.println(b + " , " + a + " , " + c);
			} else
				System.out.println(b + " , " + c + " , " + a);
		}
		//if c is smaller
		if (c < a && c < b) {
			if (a < b) {
				System.out.println(c + " , " + a + " , " + b);
			} else
				System.out.println(c + " , " + b + " , " + a);
		}

	}

}
