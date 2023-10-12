package org.parameter;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para {
	

	@Test
	public void test1() {
		Assert.assertTrue(false);
		System.out.println("A1");
	}
	
	@Parameters({"username","password"})
	@Test
	public void test2(@Optional("ABC") String user , @Optional("123") String pass) {
		System.out.println(user);
		System.out.println(pass);
	}
	
	@Test
	public void test3() {
		System.out.println("A3");
	}

}
