package com.org.cornerstone;

import com.org.abc.publicDemo;

public class DefaultAccess {
	
	String name = "Muskan";
    private	String surname = "Shaikh";

	
	public static void main(String[] args) {
		
		DefaultAccess da = new DefaultAccess();
		System.out.println("Hi "+ da.name + " " + da.surname );
		
		publicDemo pd = new publicDemo();
		System.out.println("Hi "+ pd.name);
	}
}
