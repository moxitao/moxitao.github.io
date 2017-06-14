package book;

public class Book {
	private String Id;//图书编号
	private String ISBN;//国际标准书号
	private String title;//图书名称
	private Member LoanTo;//借阅者 
	private String Type;//图书类型
	public final String getId() {
		return Id;
	}
	public final void setId(String id) {
		Id = id;
	}
	public final String getISBN() {
		return ISBN;
	}
	public final void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public final String getTitle() {
		return title;
	}
	public final void setTitle(String title) {
		this.title = title;
	}
	public Member getLoanTo() {
		return LoanTo;
	}
	public void setLoanTo(Member loanTo) {
		LoanTo = loanTo;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	public Book(String Id,String ISBN,String title,String Type){
		this.Id=Id;
		this.ISBN=ISBN;
		this.title=title;
		this.Type=Type;
	}
	
}
