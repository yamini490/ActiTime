package programmingQuestions;

public class JAP17 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 6, 3, 2 };
		int largest2;
		int largest = largest2 = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {

				largest2 = largest;
				largest = a[i];
			} else if (a[i] > largest2 && largest2 != largest) {
				largest2 = a[i];
			}

		}
		System.out.println(" 2nd largest number in an array -- >   " + largest2);

	}
}
