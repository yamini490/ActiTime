package StringPrograms;

//write a program to check whether given string is a palindrome or not
public class P13 {

	public static boolean isPalidrome(String str) {

		String temp = str;
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		if (rev.equals(temp)) {

			return true;
		} else {

			return false;
		}

	}

	public static void main(String[] args) {

		if (isPalidrome("MADAM")) {
			System.out.println("The Given String is Palindrom");
		} else {
			System.out.println("The Given String is Not Palindrom");
		}

	}

}
