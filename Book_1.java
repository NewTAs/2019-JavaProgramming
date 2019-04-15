class Books {
	String title, author;
	int ISBN;
	
	public Books(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
}
public class Book_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Books javaBook = new Books("Java JDK", "х╡╠Беб", 3333);
		
		System.out.println(javaBook.title);
		System.out.println(javaBook.author);
		System.out.println(javaBook.ISBN);
	}

}
