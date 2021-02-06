package StringPrograms;

public class P7 {

	public static void main(String[] args) {
		String str = "abc xyz abc lmn abc lmn";
		String[] strArray = str.split(" ");
		for (int i = 0; i < strArray.length - 1; i++) {
			String dupli = strArray[i];
			int count = 1;
			for (int j = i + 1; j < strArray.length; j++) {
				boolean isPreviousElement = false;
				for (int k = 0; k < i - 1; k++) {
					if (dupli.equals(strArray[k])) {
						isPreviousElement = true;
						break;
					}
				}

				if (!isPreviousElement) {
					if (dupli.equals(strArray[j])) {
						count++;
					}
				}
			}
			if (count > 1) {
				System.out.println(dupli);
				System.out.println(count);
			}
		}
	}

}
