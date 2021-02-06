package StringPrograms;

public class P18 {
//write a java program to reverse a given string with preserving the position of spaces
	public static void main(String[] args) {
		String str = "i live in bangalore";
		System.out.println(str);
		char[] ch = str.toCharArray();
		char[] psArray = new char[ch.length];
		for (int i = 0; i < ch.length; i++) {
			
			if (ch[i] == ' ') {
				psArray[i] = ' ';
			}
		}
		int j = ch.length - 1;
		for(int k=0; k<ch.length; k++) {
			
			if (ch[k] != ' ') {
				if (psArray[j] == ' ') {
					j--;
				}
				psArray[j] = ch[k];
				j--;
			}
			
		}
		System.out.println(String.valueOf(psArray));

		}
		
	}


