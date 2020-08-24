package com.kwd.structural.facade;

public class PhoneFacade {
	
	public Iphone getIphone() {
		return new Iphone("Iphone 11 Pro Max", 1300.0);
	}
	
	public Samsung getSamsung() {
		return new Samsung("Samsung S20 Ultra", 1400.0);
	}
}
