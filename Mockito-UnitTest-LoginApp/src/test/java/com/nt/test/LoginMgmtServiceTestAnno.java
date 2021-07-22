package com.nt.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import com.nt.dao.ILoginDAO;
import com.nt.service.ILoginMgmtService;
import com.nt.service.LoginMgmtServiceImpl;

public class LoginMgmtServiceTestAnno {

	@InjectMocks
	private  LoginMgmtServiceImpl loginService;
	
	@Mock
	private static ILoginDAO loginDAOMock;
	
	/*@Spy
	private static ILoginDAO loginDAOSpy;*/
	
	public LoginMgmtServiceTestAnno() {
		MockitoAnnotations.openMocks(this);
	}
	
	//Test Methods
	@Test
	public void testLoginWithValidCredentials()
	{
		//provide stub(temporary functionalities )for DAO's authenticate method
		//Mockito.when(loginDAOMock.authenticate("raja", "rani")).thenReturn(1);
		BDDMockito.given(loginDAOMock.authenticate("raja","rani")).willReturn(1);
		//unit testing
		Assertions.assertTrue(loginService.login("raja", "rani"));
	}
	
	@Test
	public void testLoginWithInValidCredentials()
	{
		//provide stub(temporary functionalities )for DAO's authenticate method
		Mockito.when(loginDAOMock.authenticate("raja", "rani1")).thenReturn(0);
		
		//unit testing
		Assertions.assertFalse(loginService.login("raja", "rani1"));
	}
	
	@Test
	public void testLoginWithNoCredentials()
	{
		Assertions.assertThrows(IllegalArgumentException.class,
				   ()->{loginService.login("", "");}
				);
	}
	
	@Test
	public void testRegisterUserWithSpy() {
		ILoginDAO loginDAOSpy=Mockito.mock(ILoginDAO.class);
		ILoginMgmtService loginService=new LoginMgmtServiceImpl(loginDAOSpy);
		loginService.registerUser("raja","admin");
		loginService.registerUser("rakesh", "visitor");
		loginService.registerUser("Golu","");
		
		Mockito.verify(loginDAOSpy,Mockito.times(1)).addUser("raja", "admin");
		Mockito.verify(loginDAOSpy,Mockito.times(0)).addUser("rakesh", "visitor");
		Mockito.verify(loginDAOSpy,Mockito.never()).addUser("Golu", "");
	}

	
}
