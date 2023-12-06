package object;

public class Ex4 {

	public static void main(String[] args) {
		Book book = new Book(200,"개미");
		System.out.println(book.toString()); 
		System.out.println(book); //자동으로 toSting을 호출하도록 설계를 해놓음

	}

}
class Book {
	int bookNumber;
	String bookTitle;
	
	public Book(int bookNumber, String bookTitle) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override//generate toString()메뉴 사용 /로직 구현해줌
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
	}
	//toString 오버라이드를 안하면 주소값이 나옴(toString의 원형)

	
	
	
}