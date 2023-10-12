package org.tstng;

import org.tstng.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registeration extends Base {
	
	public Registeration() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement create;
	
	@FindBy(name="firstname")
	private WebElement firstname;
	
	@FindBy(name="lastname")
	private WebElement lastname;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement email;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement newPassword ;
	
	@FindBy(id="day")
	private WebElement day;
	
	@FindBy(xpath="(//option[@value='12'])[1]")
	private WebElement date;
	
	@FindBy(id="month")
	private WebElement month1;
	
	@FindBy(xpath="(//option[@value='10'])[2]")
	private WebElement month;
	
	@FindBy(id="year")
	private WebElement year1;
	
	@FindBy(xpath="//option[@value='2020']")
	private WebElement year;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement gender;
	
	@FindBy(name="websubmit")
	private WebElement signup;
	
	public WebElement getCreate() {
		return create;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getNewPassword() {
		return newPassword;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth1() {
		return month1;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear1() {
		return year1;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getSignup() {
		return signup;
	}
}