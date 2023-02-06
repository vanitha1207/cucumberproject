package org.utility;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoLogin extends BaseClass {
	public PojoLogin() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(id = "email")
	private WebElement txtUser;

	@FindBy(id = "pass")
	private WebElement txtPass;

	@FindBy(name = "login")
	private WebElement btnLogin;



	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
