package com.diningphilosophers.java;
/**
 * 
 * @author Tendai T.T. Mudyiwa
 * @author Mehmet Kologlu
 * @version 03/01/2014
 * 
 * This class implements the monitor for the dining philosophers problem
 *
 */
public class Monitor {
	
	private static Table TABLE;
	public static void pickUp(Philosopher p){
		//state[i] = HUNGRY;
		test(p);
		if(!p.isEating()){
			//self[i].wait()
		}
	}
	
	public static void putDown(Philosopher p){
		//state[i] = THINKING;
		test(TABLE.philosophers[((p.getID())+4)%5]);
		test(TABLE.philosophers[((p.getID())+1)%5]);
	}
	
	public static void test(Philosopher p){
		
		if(p.isHungry() && !TABLE.philosophers[((p.getID())+4)%5].isEating() &&  !TABLE.philosophers[((p.getID())+1)%5].isEating() )
		{
			p.setEating();
			//self[i].signal();
			}
	}
	
	public static void initialize(){
		for(int i = 0; i< TABLE.philosophers.length;i++){
			TABLE.philosophers[i].setThinking();
		}
	}

}
