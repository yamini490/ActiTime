package StringPrograms;

public class ReverseAStringWhileLoop {

	public static void main(String[] args) {
		String str = "I Live in Bangalore";
		String rev = "";
		int i = str.length()-1;
		while (i >= 0) {
			rev = rev + str.charAt(i--);

			
		}
		System.out.println("Reverse a string : " + rev);

	}

}
