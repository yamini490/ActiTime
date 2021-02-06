package StringPrograms;

public class P5 {

	public static void main(String[] args) {
		String str="Yamini";
		int count=0;
	char[]	ch=str.toCharArray();
	for(char c: ch)
	{
		count++;
	}
	System.out.println("No of length of a string " + count);
	}

}
