package org.groupingg;

import org.testng.annotations.Test;

public class A {
	
	//common group names
	//Smoke-important testing at initial stage
	//Sanity-important testing at final stage 
	//Regression-End to End(E-E) testing
	//Rerun-test after bugs reported and cleared
	
	@Test(groups="Smoke")
	public void testA1() {
		System.out.println("TestA1");
	}

	@Test(groups="Smoke")
	public void testA2() {
		System.out.println("TestA2");
	}
	
	@Test(groups="Smoke")
	public void testA3() {
		System.out.println("TeatA3");
	}
	
	@Test(groups="Smoke")
	public void testA4() {
		System.out.println("TestA4");
	}
	
	@Test(groups="Sanity")
	public void testA5() {
		System.out.println("TestA5");
	}
	
	@Test(groups="Regression")
	public void testA6() {
		System.out.println("TestA6");
	}
	
	@Test(groups="Rerun")
	public void testA7() {
		System.out.println("TestA7");
	}
}
