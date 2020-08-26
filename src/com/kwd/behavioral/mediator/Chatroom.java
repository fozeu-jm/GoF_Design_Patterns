package com.kwd.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Chatroom implements Mediator {
	List<Animator> members = new ArrayList<Animator>();
	
	@Override
	public void broadcast(String source, String message) {
		members.stream().forEach(mem ->{
			if(!mem.getName().equals(source)) {mem.receive(source, message);}
		});
	}
	
	public void join(Animator member) {
		String message = member.getName()+ " just joined the room";
		broadcast("Chatroom", message);
		member.setRoom(this);
		members.add(member);
	}
	
	public void message(String source, String message, String destination) {
		members.stream().filter(mem -> mem.getName().equals(destination))
		.findFirst()
		.ifPresent(mem -> mem.receive(source, message));
	}
}
