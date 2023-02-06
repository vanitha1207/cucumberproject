package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utility.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\rerun\\Failed.txt",glue="org.stepdefinition",dryRun=false,snippets=SnippetType.CAMELCASE,plugin= {"html:target\\reports",
		"junit:target\\reports\\fblogin.xml","json:target\\reports\\fbpage.json","rerun:src\\test\\resources\\rerun\\Failed.txt"})

public class TestReRunner {
	@AfterClass
	public static void report() {
		JvmReport.generateJvumReport(System.getProperty("user.dir")+"\\target\\reports\\fbpage.json");

	}
}
