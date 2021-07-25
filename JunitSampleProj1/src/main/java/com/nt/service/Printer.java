package com.nt.service;

public class Printer {

	private static Printer INSTANCE;

    public Printer()
    {
    	
    }

	public static Printer getInstance()
	{
		return INSTANCE;
	}

}
