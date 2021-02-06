package programmingQuestions;
//14) Java Program to sort the elements of an array in ascending order
//Bubble sort
public class JAP14 {

	public static void main(String[] args) {
		int[] a= {90, 10, 80, 20, 70, 30, 60, 40, 50};
		//Bubble sort
		for(int i=0; i< a.length-1 ; i++)
		{
			for(int j=0 ; j< a.length-i-1 ; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;			
				}
			}
		}
		for(int k : a)
		{
			System.out.print(k + " ");
		}
	}

}
