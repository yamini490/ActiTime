package NumberTheoryPrograms;

public class ImmediateFiveMultiplesOfGivenNumber {

	public static void main(String[] args) {
		int n = 2;
		System.out.println("Immediate next 5 multiples of 5 : ");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " * " + n + " = " + n * i);
		}
	}

}
