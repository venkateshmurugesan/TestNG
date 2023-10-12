package org.parallell;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.tstng.Base;
import org.tstng.Login;

public class Sample extends Base {
	
	@Parameters({"browsername"})
	@BeforeClass
	private void beforeclass(String u) {
		browserLaunch(u);
		implicitlywait(10);
	}
	
	@AfterClass
	private void afterclass() {
		quit();
	}

	@BeforeMethod
	private void before() {
		Date d = new Date();
		System.out.println("Before..."+d);
	}
	
	@AfterMethod
	private void after() {
		Date d = new Date();
		System.out.println("After..."+d);
	}
	
	@Test(priority=2,dataProvider="login" , dataProviderClass=Class.class)
	private void test1(String user ,String pass) {
		urlLaunch("https://www.facebook.com/");
		implicitlywait(20);
		
		Login l=new Login();
		sendKeys(l.getTxtUserName(), user);
		sendKeys(l.getTxtPassword(), pass);
		click(l.getBtnlogin());
	}
}