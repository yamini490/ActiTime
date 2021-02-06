package NumberTheoryPrograms;

public class SumOfTwoSquareGivenNumberThirdNum {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 5;
		int num1 = a * a;
		int num2 = b * b;
		int num3 = c * c;
		if ((num1 + num2) == c || (num2 + num3) == a || (num3 + num1) == b) {
			System.out.println("True");
		} else
			System.out.println("False");

	}

}
