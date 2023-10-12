package org.parallell;

import org.testng.annotations.Test;

public class A {
	
	@Test
	private void testA1() {
		System.out.println("Test A1");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void testA2() {
		System.out.println("Test A2");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testA3() {
		System.out.println("Test A3");
		System.out.println(Thread.currentThread().getId());
	}
}
