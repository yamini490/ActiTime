package programmingQuestions;

public class JAP10 {
	public static void main(String[] args) {
		int[] arr= { 5, 2, 6, 3, 31, 12, 30};
		int smallest=arr[0];
		for(int i=1; i < arr.length ; i++)
		{
			if(arr[i] < smallest )
			{
				smallest=arr[i];
			}
		}
		System.out.println("largest element in an array " + smallest );
	}
}
