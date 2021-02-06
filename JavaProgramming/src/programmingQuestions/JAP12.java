package programmingQuestions;
// 12) Java Program to print the sum of all the items of the array
public class JAP12 {

	public static void main(String[] args) {
		int[] arr= { 5, 4, 3, 1, 2};
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of all the items of the array " + sum);
	}

}
