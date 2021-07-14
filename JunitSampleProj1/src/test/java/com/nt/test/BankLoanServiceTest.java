package com.nt.test;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.nt.service.BankLoanService;

@DisplayName("Testing BankLoanService functionalities")
//@TestMethodOrder(value=OrderAnnotation.class)
//@TestMethodOrder(value=MethodName.class)
//@TestMethodOrder(value=MethodOrderer.DisplayName.class)
@TestMethodOrder(value=MethodOrderer.Random.class)

public class BankLoanServiceTest {
	private static BankLoanService service;
	
	@BeforeAll
	public static void setUpOnce()
	{
		System.out.println("BankLoanServiceTest.setUpOnce()");
		 service=new BankLoanService();
	}
	
/*	@BeforeEach
	public void setUp()
	{
	   System.out.println("BankLoanServiceTest.setUp()");
		 service=new BankLoanService();
	}*/
	
	@Test
	@DisplayName("Testing with big number")
	//@Order(5)
	@Tag("dev")
	public void testcalcSimpleInterestAmountWithBigNo()
	{
		System.out.println("BankLoanServiceTest.testcalcSimpleInterestAmountWithBigNo()");
		//BankLoanService service=new BankLoanService();
		float actual=service.calcSimpleInterestAmount(100000, 2, 12);
		float expected=24000.0f;
		Assertions.assertEquals(expected, actual);
		
	}
	
	@Test
	@DisplayName("Testing with small no")
	//@Order(4)
	@Tag("uat")
	public void testcalcSimpleInterestAmountWithSmallNo()
	{
		System.out.println("BankLoanServiceTest.testcalcSimpleInterestAmountWithBigNo()");
		//BankLoanService service=new BankLoanService();
		float actual=service.calcSimpleInterestAmount(1000, 2, 12);
		float expected=240.0f;
		Assertions.assertEquals(expected, actual);
		
	}
  
  @Test
  @Disabled
  @DisplayName("Testing with invalid No")
  //@Order(3)
  @Tag("dev")
	public void testcalcSimpleInterestAmountWithInvalidNo()
	{
		System.out.println("BankLoanServiceTest.testcalcSimpleInterestAmountWithBigNo()");
		//BankLoanService service=new BankLoanService();
		Assertions.assertThrows(ArithmeticException.class, 
				()->{					 
					  service.calcSimpleInterestAmount(0, 0, 0);
			    	},
				"may exception raised is not matching"
				
				);
	}
  @Test
  @Disabled
  @DisplayName("Testing with timer")
  //@Order(2)
  @Tag("uat")
	public void testcalcSimpleInterestAmountWithTimer()
	{
		System.out.println("BankLoanServiceTest.testcalcSimpleInterestAmountWithBigNo()");
		//BankLoanService service=new BankLoanService();
		Assertions.assertTimeout(Duration.ofMillis(500), 
				 ()->{
					  service.calcSimpleInterestAmount(100000, 2, 12);
				     }
				 
				);
	}
  @Test
  @DisplayName("Testing with no exception")
  //@Order(1)
  @Tag("dev")
	public void testcalcSimpleInterestAmountForNoException()
	{
		System.out.println("BankLoanServiceTest.testcalcSimpleInterestAmountWithBigNo()");
		//BankLoanService service=new BankLoanService();
		Assertions.assertDoesNotThrow(
				  ()->{
					  service.calcSimpleInterestAmount(100000, 2, 12);
				  }
				);
	}
  
 /* @AfterEach
  public void clear()
  {
	  System.out.println("BankLoanServiceTest.clear()");
	  service=null;
  }*/
  @AfterAll
  public static void clearOnce()
  {
	System.out.println("BankLoanServiceTest.clearOnce()");
	  service=null;
  }
}
