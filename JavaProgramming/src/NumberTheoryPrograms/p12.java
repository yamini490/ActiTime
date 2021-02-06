package NumberTheoryPrograms;

import java.util.Arrays;

//Find out whether digits are in raising order or not in given number.
public class p12 {

	public static void main(String[] args) {
		
		int num=450912;
		int temp=num;
		int	count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		num=temp;
		int[] arr=new int[count];
		for(int k=0; k<arr.length;k++) {
			arr[k]=num%10;
			num=num/10;
		}
		
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp1=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp1;
	
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
