package org.stepdefinition;

import org.junit.Assert;
import org.utility.BaseClass;
import org.utility.PojoFrgPw;
import io.cucumber.java.en.*;

public class ForgottenPassword extends BaseClass {

	@When("user should click the forgotten password")
	public void user_should_click_the_forgotten_password() {
		PojoFrgPw p = new PojoFrgPw();
		toclick(p.getFgtPw());
	}

	@When("To pass the phone number")
	public void to_pass_the_phone_number() {
		PojoFrgPw p = new PojoFrgPw();
		passValues(p.getFind(), "1234567890");
	}

	@When("User should click the search")
	public void user_should_click_the_search() {
		PojoFrgPw p = new PojoFrgPw();
		toclick(p.getSearch());
	}

	@Then("User should navigate to incorrect credential page")
	public void user_should_navigate_to_incorrect_credential_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("validate", currentUrl.contains("reset"));
		System.out.println("validated");
	}

}
