package com.nt.service;

public class BankLoanService {

	public float calcSimpleInterestAmount(float p,float r,float t)
	{
		System.out.println("BankLonaService.calcSimpleInterestAmount()");
		if(p<=0 || r<=0 ||t<=0)
			throw new IllegalArgumentException("invalid arguments");
		
		/*
		 * try { Thread.sleep(1000); } catch(InterruptedException ie) {
		 * ie.printStackTrace(); }
		 */
		return p*r*t/100.0f;
	}
}
