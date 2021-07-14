package com.nt.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.nt.service.BankLoanService;

public class BankLoanServiceTest {
	
	
	@Test
	public void testcalcSimpleInterestAmountWithBigNo()
	{
		System.out.println("BankLoanServiceTest.testcalcSimpleInterestAmountWithBigNo()");
		BankLoanService service=new BankLoanService();
		float actual=service.calcSimpleInterestAmount(100000, 2, 12);
		float expected=24000.0f;
		Assertions.assertEquals(expected, actual);
		
	}
	
	@Test
	public void testcalcSimpleInterestAmountWithSmallNo()
	{
		System.out.println("BankLoanServiceTest.testcalcSimpleInterestAmountWithBigNo()");
		BankLoanService service=new BankLoanService();
		float actual=service.calcSimpleInterestAmount(1000, 2, 12);
		float expected=240.0f;
		Assertions.assertEquals(expected, actual);
		
	}
  
	/*@Test
	public void testcalcSimpleInterestAmountWithInvalidNo()
	{
		System.out.println("BankLoanServiceTest.testcalcSimpleInterestAmountWithBigNo()");
		
		Assertions.assertThrows(Exception, 
				()->{
					 
					BankLoanService service=new BankLoanService();
			    	}
				
				);
	}*/
}
