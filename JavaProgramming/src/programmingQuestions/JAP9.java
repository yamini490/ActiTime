package programmingQuestions;
// 9) Java Program to print the largest element in an array

public class JAP9 {

	public static void main(String[] args) {
		int[] arr= { 5, 1, 6, 3, 31, 12, 30};
		int largest=arr[0];
		for(int i=1; i < arr.length ; i++)
		{
			if(arr[i] > largest )
			{
				largest=arr[i];
			}
		}
		System.out.println("largest element in an array " + largest );
	}

}
