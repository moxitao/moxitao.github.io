package book;

public class Book {
	private String Id;//ͼ����
	private String ISBN;//���ʱ�׼���
	private String title;//ͼ������
	private Member LoanTo;//������ 
	private String Type;//ͼ������
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
