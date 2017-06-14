package book;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private String Id;//��Ա���
	private String Name;//��Ա����
	private ArrayList<Loan> Loans = new ArrayList<Loan>();//�ѽ��鼮
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
			System.out.println("����ɹ�");
			System.out.println("������"+loan.getMember().getName());
			System.out.println("�����鼮"+loan.getBook().getTitle());
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
			System.out.println("����ɹ�");
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
