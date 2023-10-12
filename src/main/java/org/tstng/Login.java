package org.tstng;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	@FindBy(id="email")
	private WebElement txtUserName;
	
	@FindBy(id="pass")
	
	private WebElement txtPassword;
	
	@FindBy(name="login")
	private WebElement btnlogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
}