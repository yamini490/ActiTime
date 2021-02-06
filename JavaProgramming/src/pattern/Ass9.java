package pattern;

public class Ass9 {

	public static void main(String[] args) {
		int row = 5;
		char ch = 'a';
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {

				if (i + j >= row - 1) {
					if (i % 2 == 0) {
						System.out.print(ch++);
					} else {
						int c1 = ch;
						c1 = c1 - 32;
						char ch1 = (char) c1;
						System.out.print(ch1++);
						int c2 = ch1;
						c2 = c2 + 32;
						ch = (char) c2;

					}
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

}
