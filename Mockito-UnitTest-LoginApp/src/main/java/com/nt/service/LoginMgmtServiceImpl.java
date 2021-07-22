package com.nt.service;

import com.nt.dao.ILoginDAO;

public class LoginMgmtServiceImpl implements ILoginMgmtService {

	private ILoginDAO loginDAO;
	
	public LoginMgmtServiceImpl(ILoginDAO loginDAO)
	{
		this.loginDAO=loginDAO;
	}
	
	@Override
	public boolean login(String username, String password) {
		 
		if(username.equals("")||password.equals(""))
			throw new IllegalArgumentException("empty credentials");
		
		int count=loginDAO.authenticate(username, password);
		if(count==0)
		     return false;
		else
			return true;
	}

	@Override
	public String registerUser(String name, String role) {
		
		if(!role.equalsIgnoreCase("")&&!role.equalsIgnoreCase("visitor"))
		{
			loginDAO.addUser(name, role);
			return "user added";
		}
		else
		   return "user not added";
	}

}
