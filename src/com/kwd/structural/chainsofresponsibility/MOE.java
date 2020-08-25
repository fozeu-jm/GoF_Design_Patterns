package com.kwd.structural.chainsofresponsibility;

public abstract class MOE {
	MOE next;
	
	public abstract void handle(String project);

	public MOE getNext() {
		return next;
	}

	public void setNext(MOE next) {
		this.next = next;
	}
	
	public void callNext(String project) {
		if(this.next != null)
			next.handle(project);
	}
}
