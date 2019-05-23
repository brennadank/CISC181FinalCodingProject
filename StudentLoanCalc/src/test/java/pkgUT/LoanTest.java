package pkgUT;

import static org.junit.Assert.*;

import org.junit.Test;

import app.controller.Loan;

public class LoanTest extends Loan{

	@Test
	public void testTotalPayment1() {
		double loanAmount = 100000;
		int term = 30;
		double interestRate = 7;
		double expected = 239508.0;
		double actual = getTotalPayments(loanAmount,term,interestRate);
		actual = Math.round(actual*100)/100;
		
		assertEquals(expected,actual,0);
	}
	
	@Test
	public void testTotalPayment2() {
		double loanAmount = 40000;
		int term = 5;
		double interestRate = 8;
		double expected = 48663.0;
		double actual = getTotalPayments(loanAmount,term,interestRate);
		actual = Math.round(actual*100)/100;
		
		assertEquals(expected,actual,0);
	}

}
