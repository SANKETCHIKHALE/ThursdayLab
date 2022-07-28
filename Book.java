

class Book {
	
	private String bookName;
	private String IdNumber;
	private String authorName;
	private String publisher;
	
	public Book(String bookName, String IdNumber, String authorName, String publisher) {
		this.bookName = bookName;
		this.IdNumber = IdNumber;
		this.authorName = authorName;
		this.publisher = publisher;
	}
	

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getIsbnNumber() {
		return IdNumber;
	}

	public void setIsbnNumber(String IdNumber) {
		this.IdNumber = IdNumber;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getBookInfo() {
		String description = "Book Name: " + getBookName() + "\n" +
								"Id Number: " + getIsbnNumber() + "\n" +
								"Author Name: " + getAuthorName() + "\n" +
								"Publisher: " + getPublisher();
		return description;
	}
	
	public static void main(String[] args) {
		
		Book b = new Book("Attitude Is EveryThing", "AT0089", "Jeff Keller", "HarperCollins");
		System.out.println("_______________________________________________________________________________________________________");
		System.out.println("Solution: ");
		System.out.println(b.getBookInfo());
	}
	

}