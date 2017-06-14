package book;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private String Id;//成员编号
	private String Name;//成员姓名
	private ArrayList<Loan> Loans = new ArrayList<Loan>();//已借书籍
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public ArrayList<Loan> getLoans() {
		return Loans;
	}
	public void setLoans(ArrayList<Loan> loans) {
		Loans = loans;
	}
	
	public Member(String Id,String Name){
		this.Id=Id;
		this.Name=Name;
	}

	

	
	public final Loan Loan(Book book){
		Loan loan = null;
		if(CanLoan(book)){
			loan = LoanFactory.CreateLoan(book,this);
			Loans.add(loan);
			System.out.println("借书成功");
			System.out.println("借书人"+loan.getMember().getName());
			System.out.println("所借书籍"+loan.getBook().getTitle());
		}
		else{
			System.out.println("error");
		}
		return loan;
		
	}
	
	public final boolean CanLoan(Book book){
		return book.getLoanTo() == null;
	}
	
	
	public final void Return(Book book){
		Loan loan = FindurrentLoanFor(book);
		if(loan != null){
			loan.MarkAsReturned();
			book.setLoanTo(null);
			System.out.println("还书成功");
		}
	}
	
	public Loan FindurrentLoanFor(Book book){
		Loan searchloan = new Loan();
		for(Loan loan : getLoans()){
			if(loan.getBook() == book){
				searchloan = loan;
			}
		}
		return searchloan;
	}
	

}
