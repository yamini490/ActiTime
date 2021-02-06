package StringPrograms;
// write a java Program to count the total number of occurrences of a given character in a string
public class P10 {

	public static void main(String[] args) {
		
		String str="Yaminiit";
	char[] chArr=str.toCharArray();
		char ch='i';
		int count=0;
		for(int i=0; i<chArr.length ; i++) {
			
		if(chArr[i]==ch)
		{
			count++;
		}
			
		}
		
		System.out.println(count);
		
	}

}
