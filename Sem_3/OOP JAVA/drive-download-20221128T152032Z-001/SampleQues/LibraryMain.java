//Mark splitup


//1 mark : if all the fields of Book and Library are private and accessed using getter and setter methods

class Book{ //1 mark
	private String title;
	private String author;
	private int isbn;
	private boolean available;
	private int borrowedBy;
	Book(String t,String a, int i){
		title = t;
		author = a;
		isbn = i;
		available = true;
		borrowedBy = 0;
	}
	public String toString() {
		return "Book:"+title+" by "+author+" ISBN:" +isbn;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean b) {
		available = b;
	}
	public int getBorrowedBy() {
		return borrowedBy;
	}
	public void setBorrowedBy(int id) {
		borrowedBy = id;
	}
	public int getisbn() {
		return isbn;
	}
}
class Library{
	private Book[] books; //1 mark
	//1 mark
	Library(){ 
		books = new Book[3];
		books[0] = new Book("harrypotter","jkr",101);
		books[1] = new Book("hungergames","sz",102);
		books[2] = new Book("evelynhardcastle","st",103);
	}
	//2 marks
	void borrowBook(int isbn, int userid) { 
		Book b = getBookbyISBN(isbn);
		if(b.isAvailable()) {
			b.setBorrowedBy(userid);
			b.setAvailable(false);
		}
	}
	//2 marks
	void returnBook(int isbn, int userid) {
		Book b = getBookbyISBN(isbn);
		if(!b.isAvailable()&&b.getBorrowedBy() == userid) {
			b.setAvailable(false);
			b.setBorrowedBy(0);
		}
	}
	//1 mark
	void showBooks() {
		for(Book i: books) {
			if(i.isAvailable()) {
				System.out.println(i.toString());
			}
		}
	}
	//1 mark - Instead of having separate method if this is done as a part of borrowBook give 0.5 marks
	Book getBookbyISBN(int isbn) {
		for(Book i: books) {
			if(i.getisbn()==isbn) {
				return i;
			}
		}
		return null;
	}
	
}
//optional
public class LibraryMain {
	public static void main(String[] args) {
		Library l = new Library();
		l.borrowBook(101,501);
		l.showBooks();
	}
}
