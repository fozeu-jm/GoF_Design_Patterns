package com.kwd.behavioral.chainsofresponsibility;

public class Manager extends MOE {

	@Override
	public void handle(String project) {
		System.out.println("Project: "+project+". Collect functional and non-functional needs");
		callNext(project);
	}

}
