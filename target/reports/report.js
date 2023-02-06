$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/loginFeatures/forgotten.feature");
formatter.feature({
  "name": "To validate the forgotten password of facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the forgotten password using invalid phone number",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should click the forgotten password",
  "keyword": "When "
});
formatter.match({
  "location": "ForgottenPassword.user_should_click_the_forgotten_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the phone number",
  "keyword": "And "
});
formatter.match({
  "location": "ForgottenPassword.to_pass_the_phone_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the search",
  "keyword": "And "
});
formatter.match({
  "location": "ForgottenPassword.user_should_click_the_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgottenPassword.user_should_navigate_to_incorrect_credential_page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: validate\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.stepdefinition.ForgottenPassword.user_should_navigate_to_incorrect_credential_page(ForgottenPassword.java:31)\r\n\tat ✽.User should navigate to incorrect credential page(file:src/test/resources/loginFeatures/forgotten.feature:6)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
