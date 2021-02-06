package interviewQuesNAL;

public class JP12AlphabetCheck {

	public static void main(String[] args) {
char c='Y';
if((c>='a' && c<='z') || (c>='A' && c<='Z') )
{
	System.out.println("Given char is alphabet");
}
else
{
	System.out.println(c + " Given char is not alphabet");
}
	}

}
