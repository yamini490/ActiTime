package pattern;

public class Ass8 {

	public static void main(String[] args) {
		int row = 5;
		int k=4;
		char chs = 'a';
		char chc= 'A';
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (i + j >= row - 1) {
					if (j == 4 || j == k ) {
						System.out.print(chs++);

					} else {
						System.out.print(chc++);
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
