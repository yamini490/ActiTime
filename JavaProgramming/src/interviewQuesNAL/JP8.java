package interviewQuesNAL;

import java.util.Scanner;

public class JP8 {
	// check whether an alphabet is vowel or consonant

	public static void main(String[] args) {
		char ch = 'e';
		System.out.println(" Enter a character :");
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(" vowel ");
			break;
		default:
			System.out.println(" consonant ");

		}

	}

}
