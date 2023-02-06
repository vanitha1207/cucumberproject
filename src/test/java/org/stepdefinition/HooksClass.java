package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utility.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	@Before(order = 1)
	public void beforeScenario() {
		System.out.println("before hooks class");
		launchBrowser();

	}

	@Before(order = 2)
	public void beforeScen() {
		loadurl("https://www.facebook.com/");
	}

	@Before(order = 3)
	public void beforesc() {
		maximize();

	}

	@After(order = 3)
	public void afterScenario() {
		System.out.println("after hooks class");

	}

	@After(order = 1)
	public void afterscen() {
		close();

	}

	@After(order = 2)
	public void aftersc(Scenario s) throws IOException {
		TakesScreenshot th = (TakesScreenshot) driver;
		byte[] sc = th.getScreenshotAs(OutputType.BYTES);
		s.embed(sc, "image/png");
	}

}
