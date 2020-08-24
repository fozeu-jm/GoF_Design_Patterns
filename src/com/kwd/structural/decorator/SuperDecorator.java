package com.kwd.structural.decorator;

public class SuperDecorator implements LivingThing {
	private LivingThing thing;
	
	public SuperDecorator(LivingThing thg) {
		this.thing = thg;
	}
	@Override
	public void move() {
		thing.move();
	}

	@Override
	public void breathing() {
		thing.breathing();
	}

	@Override
	public void run() {
		thing.run();
	}
	
	public void lazerEyes() {
		System.out.println("I can blast out lazer beams with my eyes !");
	}

}
