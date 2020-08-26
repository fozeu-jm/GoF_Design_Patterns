package com.kwd.behavioral.mediator;

public interface Mediator {
	public void broadcast(String source, String message);
	public void message(String source, String message, String destination);
	public void join(Animator member);
}
