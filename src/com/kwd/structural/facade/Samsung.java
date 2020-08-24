package com.kwd.structural.facade;

public class Samsung implements Phone {
	String model;
	Double price;

	public Samsung(String model, Double price) {
		this.model = model;
		this.price = price;
	}

	@Override
	public void modelNo() {
		System.out.println(model);
	}

	@Override
	public void price() {
		System.out.println(price);
	}

}
