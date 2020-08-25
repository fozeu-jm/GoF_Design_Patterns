package com.kwd.structural.chainsofresponsibility;

public class Tester extends MOE{

	@Override
	public void handle(String project) {
		System.out.println("Project: "+project+". Test the code thoroughly");
		callNext(project);
	}

}
