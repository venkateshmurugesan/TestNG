package org.dataproviderrrr;

import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.tstng.Base;
import org.tstng.Login;

public class Sample extends Base {
	
	@BeforeClass
	public static void before() {
		browserLaunch("edge");
		implicitlywait(20);
	}
	@BeforeMethod
	public void beforeMethod() {
		Date d=new Date();
		System.out.println("Before.."+d);
	}

	@AfterMethod
	public void afterMethod() {
		Date d=new Date();
		System.out.println("After..."+d);
	}
	
	@Test(priority=2 , dataProvider="login", dataProviderClass=Dataproviderss.class)
	public void test1(String user , String pass) {
		
		
		urlLaunch("https://www.facebook.com");
		
		Login l=new Login();
		sendKeys(l.getTxtUserName(), user);
		sendKeys(l.getTxtPassword(), pass);
		click(l.getBtnlogin());
		
	}		
}