package com.nt.service;

public interface ILoginMgmtService {
  public boolean login(String username,String password);
  public String registerUser(String name,String role);
}
