package com.nt.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.nt.service.CensusService;

public class CensusSerciveTest {
	
/* @RepeatedTest(value=10,name="execution of {displayName}--{currentRepetition}/{totalRepetitions}")
	@DisplayName("census data")
	public void testexportData()
	{
		CensusService service=new CensusService();
		Assertions.assertEquals("data exported", service.exportData());
	}*/
   
	@ParameterizedTest
	@ValueSource(ints = { 1, 11, 12, 48, 56, 75, 49 })
	public void testisOdd(int n) {
		CensusService service = new CensusService();
		Assertions.assertTrue(service.isOdd(n));

	}
}
