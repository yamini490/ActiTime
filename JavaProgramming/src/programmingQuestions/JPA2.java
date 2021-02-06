package programmingQuestions;
// 2) Java Program to find the frequency of each element in the array
public class JPA2 {

	public static void main(String[] args) {
			int arr[]= {1,4,5,6,4,4,4,5,5,6};
			int f[]=new int[arr.length];
			for(int i=0; i< arr.length ; i++)
			{
				boolean done=false;
				int count=1;
				for(int k=0; k< i ; k++)
				{
				if(arr[i]==arr[k])
				{
					done=true;
					break;
				}
				}
				if(!done) {
				for(int j=i+1; j<arr.length; j++)
				{
					
				if(arr[i]==arr[j])
				{
					count++;
				}
				}
				System.out.println(arr[i] + " <------------> " + count);
			}
			}

	}

}
