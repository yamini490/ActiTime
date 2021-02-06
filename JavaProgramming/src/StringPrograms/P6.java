package StringPrograms;

public class P6 {

	public static void main(String[] args) {
		String str="I Live in Bangalore";
		char[] ch=str.toCharArray();
		int count=1;
		for(int i=0; i<ch.length; i++)
		{
			if( ch[i] == ' ' && ch[i+1] !=' ')
			{
				count++;
			}
			
		}
		System.out.println(count);

	}

}
