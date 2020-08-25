package com.kwd.structural.chainsofresponsibility;

public class Developer extends MOE {

	@Override
	public void handle(String project) {
		System.out.println("Project: "+project+". Develop the project by writing scalable, extensible and maintanable code");
		callNext(project);
	}

}
