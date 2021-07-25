package com.nt.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import com.nt.service.CensusService;

public class CensusSerciveTest {
	
/* @RepeatedTest(value=10,name="execution of {displayName}--{currentRepetition}/{totalRepetitions}")
	@DisplayName("census data")
	public void testexportData()
	{
		CensusService service=new CensusService();
		Assertions.assertEquals("data exported", service.exportData());
	}*/
   
	/*@ParameterizedTest
	@ValueSource(ints = { 1, 11, 12, 48, 56, 75, 49 })
	public void testisOdd(int n) {
		CensusService service = new CensusService();
		Assertions.assertTrue(service.isOdd(n));

	}*/
	
	/*@ParameterizedTest
	@ValueSource(strings = { "md","alam" })
	public void testsayHello(String user) {
		CensusService service = new CensusService();
		Assertions.assertEquals("hello"+user, service.sayHello(user));

	}*/
	
	@ParameterizedTest
	//@ValueSource(strings = { ""," ","a" })
	//@EmptySource
	//@NullSource
	@NullAndEmptySource
	public void testsayHello(String user) {
		CensusService service = new CensusService();
		Assertions.assertTrue(service.isEmpty(user));
	}
}
