package collectionsss;

import java.util.ArrayList;

public class BookDriver {

	public static void main(String[] args) {
		ArrayList<Book> al=new ArrayList<>();
		al.add(new Book("Java", "ABC", 100));
		al.add(new Book("SQL", "MNO", 200));
		al.add(new Book("MT", "XYZ", 300));
		System.out.println(al.size());
		System.out.println(al);
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).author);
//			Book b=(Book)al.get(i);
//			b.bookDetails();
			System.out.println("================================");
		}
	
	}

}
