package NumberTheoryPrograms;

public class PrintAscendingOrder3Num {

	public static void main(String[] args) {
		int a=50, b=10, c=30;
		int[] arr= {a,b,c};
		
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0 ; j< arr.length-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int x: arr)
		{
			System.out.println(x);
		}
	}
	
	}