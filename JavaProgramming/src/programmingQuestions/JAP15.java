package programmingQuestions;

public class JAP15 {

	public static void main(String[] args) {
		int[] a= {90, 10, 80, 20, 70, 30, 60, 40, 50};
		//Bubble_Sort
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

	}

}
