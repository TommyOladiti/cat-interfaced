package com.credersi.animals;

public class Wolf extends Animal implements Roar, Fly {
	public Wolf() {	}
	
	public int roar() {
		return 90;
	}
	
	public boolean fly() {
		
		if(this.roar() < 80 ) 
		return true;
		else return false;
	}
}