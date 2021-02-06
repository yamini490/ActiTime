package programmingQuestions;

public class JAP3 {

	public static void main(String[] args) {
	int	arr[] ={1, 2, 3, 4, 5 };
	for(int i=0 ; i< arr.length-1; i++)
	{
//	int	first=arr[i];
//	int	second=arr[i+1];
//	arr[i]=second;
//	arr[i+1]=first;
		int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
		
	}
	for(int i : arr)
	{
		System.out.print(i + " , ");
	}
	}

}
