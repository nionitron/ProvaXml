public class Book {

	private String title;
	private String author;
	private String subject;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, String subject) {
		this.author = author;
		this.subject = subject;
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}