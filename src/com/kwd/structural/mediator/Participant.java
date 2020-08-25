package com.kwd.structural.mediator;

public class Participant implements Animator {
	Mediator room;
	private String name;
	
	public Participant(String p_name) {
		this.name = p_name;
	}
	
	@Override
	public void receive(String source, String message) {
		System.out.println("["+ name + "'s Session] "+ source + ": "+message);
	}

	@Override
	public void say(String message) {
		room.broadcast(name, message);
	}

	@Override
	public void privateMessage(String destination, String message) {
		room.message(this.getName(), message, destination);
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setRoom(Mediator room) {
		this.room = room;
	}
}
