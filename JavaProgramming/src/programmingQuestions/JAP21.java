package programmingQuestions;
/*
 * 21) Remove Duplicate Element in an Array
Write a java program to remove duplicate element in an array.
Input: 10,20,20,30,30,40,50,50
Output: 10 20 30 40 50
10 
20 
30 
50 
 */
public class JAP21 {
	public static void main(String[] args) {
		int[] arr= {10,20, 30, 10, 20, 30, 50,50, 40};
		int[] b=new int[arr.length];
		b[0]=arr[0];
		int count=1;
		for(int i=1; i<arr.length; i++)
		{
			int j;
			for(j=0; j<count; j++)
			{
				if(arr[i]==b[j])
				{
					break;
				}
				
			}
			if(j==count)
			{
				b[j]=arr[i];
				count++;
			}
		}
	
	for(int i=0; i<count; i++)
	{

	System.out.print(b[i] + " ");	
	}
	
	System.out.println("\nNo of Elements presents in an array : " + b.length);	
	}

}
