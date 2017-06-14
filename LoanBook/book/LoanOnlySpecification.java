package book;

import java.util.ArrayList;

public class LoanOnlySpecification implements ISpecification<Member> {
	private Book wantbook;
	public  LoanOnlySpecification(Book wantbook) {
		this.wantbook=wantbook;
	}
	
	@Override
	public boolean IsSatisfiedBy(Member member) {
		// TODO Auto-generated method stub
		ArrayList<Loan> loans = new ArrayList<Loan>();
		loans=member.getLoans();
		int count=0;
		for(Loan loan : loans){
			if((loan.getBook().getId()==wantbook.getId())&&(loan.getReturnDate()==null)){
				count=count+1;
			}
		}
		if(count == 0){
			return true;
		}else{
			return false;
		}
		
	}

}
