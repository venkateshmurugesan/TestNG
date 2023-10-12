package org.dataproviderrrr;

import org.testng.annotations.DataProvider;

public class Dataproviderss {
	
	
	@DataProvider(name="login")
	private Object [] [] datas() {
		Object [] [] obj =new Object [] [] {
			{"Dinesh","8888"},
			{"Green","7777"},
			{"Raj","6666"}	
		};
		return obj;
	}

	@DataProvider(name="register")
	private Object [] [] datass() {
		Object [] [] obj =new Object [] [] {
			{"Dinesh","8888"},
			{"Greens","7777"},
			{"Raj","6666"}
		};
		return obj;	
	}
	
}
