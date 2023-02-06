package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.jsoup.parser.TokenQueue;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.utility.BaseClass;
import org.utility.PojoFrgPw;
import org.utility.PojoLogin;

import io.cucumber.java.en.*;

public class LoginStepDefinition extends BaseClass {

	@When("User should click the login button")
	public void user_should_click_the_login_button() throws InterruptedException {
		PojoLogin l = new PojoLogin();
		toclick(l.getBtnLogin());
		Thread.sleep(3000);

	}

	@When("To print the title of the webpage")
	public void to_print_the_title_of_the_webpage() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	@Then("It will navigate to invalid credential page")
	public void it_will_navigate_to_invalid_credential_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("validating", currentUrl.contains("privacy"));
		System.out.println(currentUrl);

	}

	@Then("It will navigate  to invalid credential page")
	public void itWillNavigateToInvalidCredentialPage() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("validating", currentUrl.contains("privacy"));
		System.out.println(currentUrl);

	}
	@When("User should type invalid username and invalid password")
	public void userShouldTypeInvalidUsernameAndInvalidPassword(io.cucumber.datatable.DataTable dataTable) {
	PojoLogin p=new PojoLogin();
	List<String> a = dataTable.asList();
	passValues(p.getTxtUser(),a.get(0));
	passValues(p.getTxtPass(),a.get(2));
	}

	@When("User should type valid username in the invalid password text box")
	public void userShouldTypeValidUsernameInTheInvalidPasswordTextBox(io.cucumber.datatable.DataTable dataTable) {
		PojoLogin p=new PojoLogin();
		List<List<String>> a = dataTable.asLists();
		passValues(p.getTxtUser(),a.get(0).get(0));
		passValues(p.getTxtPass(),a.get(1).get(1));
		}
	

	@When("User should type invalid username and valid password text box")
	public void userShouldTypeInvalidUsernameAndValidPasswordTextBox(io.cucumber.datatable.DataTable dataTable) {
		PojoLogin p=new PojoLogin();
		Map<String,String> a = dataTable.asMap(String.class,String.class);
		passValues(p.getTxtUser(),a.get("user"));
		passValues(p.getTxtPass(),a.get("pass"));
		}
	

	
	@When("User should type valid username and valid password text box")
	public void userShouldTypeValidUsernameAndValidPasswordTextBox(io.cucumber.datatable.DataTable dataTable) {
		PojoLogin p=new PojoLogin();
		List<Map<String, String>> a = dataTable.asMaps();
		passValues(p.getTxtUser(),a.get(0).get("user"));
		passValues(p.getTxtPass(),a.get(1).get("pass"));
		}

	}



