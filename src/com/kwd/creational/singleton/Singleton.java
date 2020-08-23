package com.kwd.creational.singleton;

import java.io.Serializable;

public final class Singleton implements Serializable {
	private static final long serialVersionUID = 1L;

	private int value = 0;
	

	private Singleton() throws Exception {
	}

	// Use of a inner static class to get instance makes the process thread safety
	private static class SingletonHolder {
		private static Singleton INSTANCE;
		
		// use a static block if creation of singleton can raise an exception
		static {
			try {
				INSTANCE = new Singleton();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

	protected Object readResolve() {
		return SingletonHolder.INSTANCE;
	}

}
