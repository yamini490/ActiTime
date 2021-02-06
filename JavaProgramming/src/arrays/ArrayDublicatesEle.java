package arrays;

public class ArrayDublicatesEle {
	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 1, 0, 3, 4, 2 };
		
		int k = 1;
		int[] b = new int[a.length];
		b[0] = a[0];
		int count = 0;
		for (int i = 1; i < a.length; i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (a[i] == b[j]) {
					break;
				}
			}
			if (i == j) {
				b[k++] = a[i];
				count++;
			}
		}
		for (int j = 0; j < count; j++) {
			System.out.print(b[j] + " ");
		}
	}
}
