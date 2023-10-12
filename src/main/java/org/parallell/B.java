package org.parallell;

import org.testng.annotations.Test;

public class B {

	@Test
	private void testB1() {
		System.out.println("Test B1");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void testB2() {
		System.out.println("Test B2");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testB3() {
		System.out.println("Test B3");
		System.out.println(Thread.currentThread().getId());
	}
	
}
