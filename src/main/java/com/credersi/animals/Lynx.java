package com.credersi.animals;

public class Lynx extends Animal implements Purr, Roar, Fly {
	public Lynx() {	}
	
	public int purr() {
		return 10;
	}
	public int roar() {
		
		if (this.purr() > 20) 
		return 60;
		else return 10;
		
	}
	
	public boolean fly(){
		
		return false;
	}
}