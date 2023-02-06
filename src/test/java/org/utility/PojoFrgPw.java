package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoFrgPw extends BaseClass {
	public PojoFrgPw() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement FgtPw;

	@FindBy(id = "identify_email")
	private WebElement Find;
	
	@FindBy(id = "did_submit")
	private WebElement Search;

	public WebElement getFgtPw() {
		return FgtPw;
	}

	public WebElement getFind() {
		return Find;
	}

	public WebElement getSearch() {
		return Search;
	}
}
