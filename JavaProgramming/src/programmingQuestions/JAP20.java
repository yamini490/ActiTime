package programmingQuestions;
/*
 * 20) Find Smallest Number in an Array
Write a java program to find smallest number in an array.
Input: 1,2,5,6,3,2
Output: 1
 */
public class JAP20 {

	public static void main(String[] args) {
		int[] a= {1,2,5,6,3,2};
		int smallest=a[0];
		for(int i=0; i<a.length ; i++)
		{
			if(a[i]< smallest)
			{
				smallest=a[i];
			}
		}
		System.out.println(" smallest number in an array " + smallest);

	}

}
