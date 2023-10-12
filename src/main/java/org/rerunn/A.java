package org.rerunn;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	
	@Test
	private void testA1() {
		System.out.println("Test A1");
	}

	@Test(retryAnalyzer=WithKnownFailedd.class)
	private void testA2() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter boolean condition");
		Assert.assertTrue(s.nextBoolean());
		System.out.println("Test A2");
	}
	
	@Test
	private void testA3() {
		System.out.println("Test A3");
	}
}
