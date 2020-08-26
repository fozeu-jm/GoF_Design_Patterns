package com.kwd.behavioral.chainsofresponsibility;

public class ItProjectChainFactory {

	public static MOE getChain() {
		MOE manager = new Manager();
		MOE developer = new Developer();
		MOE tester = new Tester();
		manager.setNext(developer);
		developer.setNext(tester);
		
		return manager;
	}
}
