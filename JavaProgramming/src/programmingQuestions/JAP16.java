package programmingQuestions;
/*
 * Write a java program to find 3rd largest number in an array.
		Input: 1,2,5,6,3,2
		Output: 3
 */
public class JAP16 {

	public static void main(String[] args) {
		int[] a= {1,2,5,6,3,2};
		int largest2, largest3;
		int largest=largest2=largest3=a[0];
		for(int i=0 ; i< a.length ; i++)
		{
			if(a[i] >largest )
			{
				largest3=largest2;
				largest2=largest;
				largest=a[i];
			}
			else if(a[i] > largest2 && largest2 != largest )
			{
				largest3=largest2;
				largest2=a[i];
			}
			else if(a[i]> largest3 && largest3 != largest2 ) {
				largest3=a[i];
				
			}
		}
		System.out.println(" 3rd largest number in an array -- >   " + largest3);
	}

}
