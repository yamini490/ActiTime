package interviewQuesNAL;

public class JP17_DisplayCharacterAToZ {

	public static void main(String[] args) {
	
	for(char ch='A'; ch<='Z' ; ch++)
	{
		System.out.print(ch + " , ");
	}
	System.out.println();
	char ch1='A';
	while (ch1<= 'Z')
	{
		System.out.print(ch1++ + "  ");
	}

	}

}
