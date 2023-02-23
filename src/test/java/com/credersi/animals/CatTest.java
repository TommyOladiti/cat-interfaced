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
	
	
	
	
}