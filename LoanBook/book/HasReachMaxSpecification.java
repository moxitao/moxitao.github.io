package book;

import java.util.ArrayList;

public class HasReachMaxSpecification implements ISpecification<Member> {
	public boolean IsSatisfiedBy(Member member) {
		// TODO Auto-generated method stub
		int count=0;
		ArrayList<Loan> loans = new ArrayList<Loan>();
		loans=member.getLoans();
		for(Loan loan : loans){
			if(loan.getReturnDate()==null)
				count=count+1;
		}
		if(count>=3){
			return true;
		}else{
			return false;
		}
	}
}
