package StringPrograms;

// Write a program to reverse the given string word wise
public class P8 {

	public static void main(String[] args) {
		String str = "I Live In Bangalore";
		char[] ch = str.toCharArray();
		String rev = "";
		for (int i = 0; i < ch.length; i++) {
			int sp = i;
			while (i < ch.length && ch[i] != ' ') {
				i++;
			}
			int ep = i - 1;
			String temp = "";
			if (ep >= sp) {
				
				for (int w = sp; w <= ep; w++) {
					temp = temp + ch[w];

				}
				System.out.println(temp);
			}
			temp=temp+" ";
			rev=temp+rev;

		}
		System.out.println(rev);

	}

}
