package StringPrograms;
//write a java Program to reverse each word of a given string
public class P19 {

	public static void main(String[] args) {
		String str="I Live In Bangalore";
		System.out.println(str);
		String rev="";
		char[] ch=str.toCharArray();
		
		for(int i=0; i<ch.length ; i++)
		{
		int sp=i;
		while (i < ch.length && ch[i] != ' ') {
			i++;
		}
		int ep = i - 1;
		String temp="";
			if(ep>=sp)
			{
				
				for(int k=ep; k>=sp; k--) {
					temp=temp+ch[k];
				}
			}
		//System.out.println(temp);	
			
			rev=rev+temp+ " ";
		}
		System.out.println(rev);
	}

}
