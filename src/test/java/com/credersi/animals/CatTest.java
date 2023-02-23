package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertEquals(cat.purr(), 25);
	}
	
	@Test
	public void testLynx() {
		Lynx lynx = new Lynx();
		assertEquals(lynx.roar(), 10);
	}
	
	@Test
	public void testWolf() {
		Wolf wolf = new Wolf();
		assertEquals(wolf.fly(), false);
	}
	
	@Test
	public void testCatFly() {
		Cat cat = new Cat();
		assertEquals(cat.fly(), true);
	}
	
	
	
	private int slap(Roar roarer) {
		return roarer.roar();
	}
	
	@Test
	public void testCatRoar() {
		Roar wolf = new Wolf();
		Roar lynx = new Lynx();
		
		
		assertEquals(this.slap(wolf), 90);
		assertEquals(this.slap(lynx), 10);
	}

	
}