package StringPrograms;

//write a java program to find duplicates characters in a String
public class P16 {

	public static void main(String[] args) {
		String str = "i live in bangalore";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			boolean isNotDuplicate = true;
			for (int j = i+1; j < ch.length; j++) {

				for (int k = 0; k < i - 1; k++) {
					if (ch[i] == ch[k]) {
						isNotDuplicate = false;
						break;
					}
				}
				if (isNotDuplicate) {
					if (ch[i] == ch[j] && ch[i]!=' ') {
						System.out.print(ch[i] + " ");
					}
				}
			}
		}
	}

}
