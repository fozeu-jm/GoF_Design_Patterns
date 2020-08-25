package com.kwd.structural.mediator;

public interface Animator {
	public void receive(String source, String message);
	public void say(String message);
	public void privateMessage(String destination, String message);
	public String getName();
	public void setRoom(Mediator room);
}
