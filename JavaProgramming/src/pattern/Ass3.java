package pattern;

public class Ass3 {

	public static void main(String[] args) {
		int row = 5;
		int k = 1;
		for (int i = 0; i < row; i++) {

			char ch = 'a';
			for (int j = 0; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print(k++);
				} else {
					System.out.print(ch++);
				}
			}
			System.out.println();
		}
	}
}
