package pattern;

public class Ass7 {

	public static void main(String[] args) {
		int row = 5;
		int k = 4;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (i + j >= row - 1) {
					if (j == 4 || j == k || i == 4) {
						System.out.print("*");

					} else {
						System.out.print(" ");
					}

				} else {
					System.out.print(" ");
				}

			}
			k--;
			System.out.println();

		}

	}

}
