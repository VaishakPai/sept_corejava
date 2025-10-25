package com.vtech.encapulation;

import java.util.Date;

public class MarkerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marker marker = new Marker();
		marker.setBrand("DOMS");
		marker.setColor("Red");
		marker.setPrice(50.5);
		marker.setType("Temporary");
		marker.setExpiryDate(new Date(2025, 12, 1));
		
		
		System.out.println(marker.getBrand());
		System.out.println(marker.getColor());
		System.out.println(marker.getPrice());
		System.out.println(marker.getType());
		System.out.println(marker.getExpiryDate());
		
		

	}

}
