package NumberTheoryPrograms;

public class PrintSumOfAllEvenNumbers {

	public static void main(String[] args) {
		int num1 = 1, num2 = 10, sum = 0;
		System.out.print("Sum of all even number is : \t");
		while (num1 <= num2) {
			if (num1 % 2 == 0) {
				sum = sum + num1;
			}
			num1++;
		}
		System.out.print(sum);

	}

}
