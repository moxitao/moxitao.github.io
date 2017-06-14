package book;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LoanFactory {
	public static Loan CreateLoan(Book book,Member member){
		var loan = new Loan();
		LocalDateTime localDateTime = LocalDateTime.now();
		loan.Book=book;
		loan.Member=member;
		loan.LoanDate=DateTime.Now; 
		loan.DateForReturn=DateTime.Now.AddDays(10);
		return loan;
	}
}

