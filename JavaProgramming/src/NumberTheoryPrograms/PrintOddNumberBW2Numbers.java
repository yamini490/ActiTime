package NumberTheoryPrograms;

public class PrintOddNumberBW2Numbers {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		System.out.print("Odd Number is ");
		while (num1 <= num2) {
			if (num1 % 2 == 1) {
				System.out.println(num1);
			}
			num1++;
		}

	}

}
