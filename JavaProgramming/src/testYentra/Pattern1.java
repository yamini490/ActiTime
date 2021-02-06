package testYentra;

public class Pattern1 {

	public static void main(String[] args) {
		int num = 475761;
		int temp = num, count = 0;
		// Finding no of digits
		while (num > 0) {
			count++;
			num = num / 10;
		}
		// creating array for interger
		int[] c = new int[count];
		num = temp;
		// intializing the Array numbers
		while (num > 0) {
			for (int l = 0; l < c.length; l++) {
				c[l] = num % 10;
				num = num / 10;
			}
		}
		int k = c.length - 1;
		// pattern to print integers
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i >= j) {
					System.out.print(c[k--]);
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
