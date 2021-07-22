package com.nt.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MockVsSpyTest {
	
	@Test
  public void testList()
  {
	  List<String> listMock=Mockito.mock(ArrayList.class);//mock
	  //List<String> listSpy=Mockito.spy(new ArrayList());//spy
	  List<String> listSpy=Mockito.spy(ArrayList.class);//spy
		  
	  listMock.add("Table");
	  Mockito.when(listMock.size()).thenReturn(10);//stub on mock obj
	  listSpy.add("Table");
	  Mockito.when(listSpy.size()).thenReturn(10);//stub on spy obj
		 
	  System.out.println(listMock.size()+"    "+listSpy.size());
  }
}
