package pattern;

public class Ass2 {

	public static void main(String[] args) {
		int row = 5;
		for (int i = 0; i < row; i++) {
			int k = 1;
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
