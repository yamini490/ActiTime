package programmingQuestions;

public class JAP4 {

	public static void main(String[] args) {
		int[] arr = { 1, 8, 3, 2, 3, 4, 2, 7, 8, 8, 3, 4 };
		//traversing from current element to all other elements
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			// To find duplicate element -- checking from i + 1 elements
			for (int j = i + 1; j < arr.length; j++) {
				boolean done = true;
				// checking duplicates from pervious other elements
				for (int k = 0; k < i; k++) {
					if (arr[i] == arr[k]) {
						done = false;
						break;
					}
				}
				// if not duplicate from previous node check for duplication from current  after nodes  
				if (done) {
					if (arr[i] == arr[j]) {
						
						count++;
						break;
					}
				}
			}
			if (count > 1) {
				System.out.println(arr[i]);
			}
			
		}
	}

}
