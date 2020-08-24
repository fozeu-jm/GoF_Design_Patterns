package com.kwd.structural.bridge;

public abstract class Remote {
	//Here is the bridge
	protected Device device;
	
	abstract void power();

	abstract void volumeDown();

    abstract void volumeUp();

    abstract void channelDown();

    abstract void channelUp();
}
