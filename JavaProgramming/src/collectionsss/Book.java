package collectionsss;

public class Book {

	String title;
	String author;
	double price;
	
	Book()
	{
		
	}
	public Book(String title, String author, double price)
	{
	super()	;
	this.title=title;
	this.author=author;
	this.price=price;
	}
	
	public void bookDetails()
	{
		System.out.println("Tiltle---> : " + title);
		System.out.println("Author---> : " + author);
		System.out.println("Price---> : " + price);
	}
}
