package com.vtech.inheritance.androidphone;

public class MobileRunner {

	public static void main(String[] args) {
		Android a1 = new Android();
        Android a2 = new Android("Pixel");
        Android a3 = new Android("Pixel", "Google");
        Android a4 = new Android("Pixel", "Google", 79999, 14.0);
        
        System.out.println("\n--- Displaying Android Details ---");

        a1.display();
        
        a2.display();
        
        a3.display();
        
        a4.display();

	}

}
