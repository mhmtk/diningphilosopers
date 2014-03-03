package com.diningphilosophers.java;

import java.util.ArrayList;

import android.app.Activity;
import android.view.View;

public class Philosopher {
	
	//Instance variables for states of a philosopher
	private static final String THINKING = "THINKING";
	private static final String EATING = "EATING";
	private static final String HUNGRY = "HUNGRY";
	
	//Keep track of philosopher statistics
	private ArrayList<Double> thinkingTimes;
	private ArrayList<Double> eatingTimes;
	private ArrayList<Double> hungryTimes;
	
	private double hungryTimeCounter;
	private double eatingTimeCounter;
	private double thinkingTimeCounter;
	
	private int ID;
	
	public Philosopher(int ID, Activity activity, View view){
		
		this.eatingTimeCounter = 0;
		this.hungryTimeCounter = 0;
		this.thinkingTimeCounter = 0;
		this.thinkingTimes = new ArrayList<Double>();
		this.hungryTimes = new ArrayList<Double>();
		this.eatingTimes = new ArrayList<Double>();
		
		this.ID = ID;
		
	}


	public boolean isEating() {
		// TODO Auto-generated method stub
		return false;
	}


	public int getID() {
		return this.ID;
	}


	public void setThinking() {
		// TODO Auto-generated method stub
		
	}


	public boolean isHungry() {
		// TODO Auto-generated method stub
		return false;
	}


	public void setEating() {
		// TODO Auto-generated method stub
		
	}
	

	
}
