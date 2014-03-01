package com.diningphilosophers.java;

/**
 * 
 * @author Tendai T.T. Mudyiwa
 * @author Mehmet Kologlu
 * @version 03/01/2014
 * 
 *          This class implements the fork object for the dining philosophers
 *          problem
 * 
 */

public class Fork {

	private int forkId;
	private boolean free;

	public Fork(int forkId) {

		this.forkId = forkId;
		this.free = true;
	}

	public int getForkId() {
		return this.forkId;
	}

	public boolean available() {
		return this.free;
	}

	public void use() {
		this.free = false;
	}

	public void release() {
		this.free = true;
	}

}
