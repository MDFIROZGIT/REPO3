package com.nt.dao;

public interface ILoginDAO {

	public int authenticate(String username,String password);
	public int addUser(String name,String role);
}
