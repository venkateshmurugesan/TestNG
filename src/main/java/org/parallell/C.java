package org.parallell;

import org.testng.annotations.Test;

public class C {
	
	@Test
	private void testC1() {
		System.out.println("Test C1");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void testC2() {
		System.out.println("Test C2");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testC3() {
		System.out.println("Test C3");
		System.out.println(Thread.currentThread().getId());
	}

}
