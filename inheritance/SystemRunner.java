package com.vtech.inheritance;

public class SystemRunner {

	public static void main(String args[]) {
		ChildClass child = new ChildClass();
		child.property();//inheritance method 
		
		child.ownMethod();// child's own method 
	}
	
}
