package StringPrograms;

public class P12 {

	public static void main(String[] args) {
		
		// Write a program to removedWhiteSpaceserse the given string word wise
		
				String str = "I Live In Bangalore";
				String removeW=str.replaceAll(" ", "");
				System.out.println("Logic 1: " +removeW);
				System.out.println(str);
				char[] ch = str.toCharArray();
				String removedWhiteSpaces = "";
				
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
						//System.out.println(temp);
					}
					
					removedWhiteSpaces=removedWhiteSpaces+temp;

				}
				System.out.println(removedWhiteSpaces);

			}


}
