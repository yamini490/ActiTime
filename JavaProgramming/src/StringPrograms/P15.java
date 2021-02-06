package StringPrograms;

//write a  program to check balance of brackets in the given string
public class P15 {

	public static void main(String[] args) {
		String str = "({yami})";
		int oBracket = 0, cBracket = 0, pOBracket = 0, pCBracket = 0, sOBracket = 0, sCBracket = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			switch (ch[i]) {
			case '(':
				oBracket++;
				break;
			case ')':
				cBracket++;
				break;
			case '{':
				pOBracket++;
				break;
			case '}':
				pCBracket++;
				break;
			case '[':
				sOBracket++;
				break;
			case ']':
				sCBracket++;
				break;

			}

		}
		if (oBracket == cBracket) {
			System.out.println(oBracket);
			System.out.println(cBracket);
			System.out.println(" The String has '(' balanced Brackets");
		} else {
			System.out.println(oBracket);
			System.out.println(cBracket);

			System.out.println(" The String does not have '(' balanced Brackets");
		}
		if (pOBracket == pCBracket) {
			System.out.println(pOBracket);
			System.out.println(pCBracket);
			System.out.println(" The String has '{' balanced  Brackets");
		} else {
			System.out.println(pOBracket);
			System.out.println(pCBracket);
			System.out.println(" The String does not have '{' balanced Brackets");
		}
		if (sOBracket == sCBracket) {
			System.out.println(sOBracket);
			System.out.println(sCBracket);
			System.out.println(" The String has '[' balanced Brackets");
		} else {
			System.out.println(sOBracket);
			System.out.println(sCBracket);

			System.out.println(" The String does not have '[' balanced Brackets");
		}
	}
}