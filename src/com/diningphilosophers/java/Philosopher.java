package com.diningphilosophers.java;

public class Philosopher {
	
	private boolean thinking;
	private boolean eating;
	private boolean hungry;
	
	public Philosopher(){
		
		this.thinking = false;
		this.eating = false;
		this.hungry = false;
		
	}

	public boolean isThinking() {
		return thinking;
	}

	public boolean isEating() {
		return eating;
	}

	public boolean isHungry() {
		return hungry;
	}

}
