class Bookes {
	String title, author;
	int ISBN;
	
	public Bookes(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	
	public Bookes(String title, int ISBN) {
		this(title, "Annonymous", ISBN);
	}
	
	public Bookes() {
		this(null, null, 0);
		System.out.println("생성자가 호출되었음.");
	}
}

public class Book_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bookes javaBook = new Bookes("Java JDK", "황기태", 3333);
		System.out.println(javaBook.title);
		System.out.println(javaBook.author);
		System.out.println(javaBook.ISBN);
		
		Bookes holyBible = new Bookes("Holy Bible", 1);
		System.out.println(holyBible.title);
		System.out.println(holyBible.author);
		System.out.println(holyBible.ISBN);
		
		Bookes emptyBook = new Bookes();
		System.out.println(emptyBook.title);
		System.out.println(emptyBook.author);
		System.out.println(emptyBook.ISBN);
		
	}

}
