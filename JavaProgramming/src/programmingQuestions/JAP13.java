package programmingQuestions;

// 13) Java Program to right rotate the elements of an array
public class JAP13 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int i = arr.length - 1; i > 0; i--) {
			int temp = arr[i];
			arr[i] = arr[i - 1];
			arr[i - 1] = temp;
		}
		for (int i : arr) {
			System.out.print(i + " , ");
		}
	}

}
