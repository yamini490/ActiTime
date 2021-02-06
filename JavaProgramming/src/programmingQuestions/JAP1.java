package programmingQuestions;
// 1) Java Program to copy all elements of one array into another array
public class JAP1 {

	public static void main(String[] args) {
		int[] arr= {31, 30, 29, 28, 27, 26, 25};
		int[] cpyArr=new int[arr.length];
		for(int i=0 ;i<arr.length;i++)
		{
			cpyArr[i]=arr[i];
		}
for(int i :cpyArr)
{
	System.out.println(i);
}
	}

}
