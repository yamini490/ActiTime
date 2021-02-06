package programmingQuestions;

/*
 * 
 19) Find 2nd Smallest Number in an Array
Write a java program to find 2nd smallest number in an array.
Input: 1,2,5,6,3,2
Output: 2
 */
public class JAP19 {

	public static void main(String[] args) {
		int[] a = { 1, 4, 5, 6, 8, 9, 10  };
		int first, second;
			first = a[0];
			second=a[0];
		for (int i = 0; i < a.length-1; i++) { // 0,6 ,f //1,6,f //2,6,f // 3,6,
			if (a[i] < first) { 
				second = first;
				first = a[i];  
			} else if (a[i] < second ) {
				second = a[i];
			}
		}
		System.out.println(" 2nd Smallest Number in an Array -- > " + second);
		
	}

}
