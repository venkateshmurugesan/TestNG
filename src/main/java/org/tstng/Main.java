package org.tstng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Main extends Base {
	
	@BeforeClass
	public static void before() {
		browserLaunch("edge");
	}
	
	
	@Test(priority=4)
	public void test1() {
		// to verify url
		urlLaunch("https://www.facebook.com/");
		Assert.assertTrue(getCurrentUrl().contains("facebook"), "verify url");
		implicitlywait(20);
		
		Login l=new Login();
		
		//to verify username
		sendKeys(l.getTxtUserName(), "abc@gmail.com");
		Assert.assertEquals(getAttribute(l.getTxtUserName()), "abc@gmail.com", "verify username");
		
		//to verify password
		sendKeys(l.getTxtPassword(), "9876");
		Assert.assertEquals(getAttribute(l.getTxtPassword()), "9876", "verify password");
		
		//to verify login page
		click(l.getBtnlogin());
		Assert.assertTrue(getCurrentUrl().contains("?privacy_mutation_token"), "verify is that valid login");
	
	}
	
	@Test(priority=-4)
	public void test2() {
		Registeration r=new Registeration();
		
		urlLaunch("https://www.facebook.com/");

		click(r.getCreate());
		sendKeys(r.getFirstname(), "Venkat");
		sendKeys(r.getLastname(), "M");
		sendKeys(r.getEmail(), "abc@gmail");
		click(r.getSignup());
		System.out.println("test1");
	}
}
