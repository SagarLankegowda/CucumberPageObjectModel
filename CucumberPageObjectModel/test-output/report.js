$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sony/eclipse-workspace/CucumberPageObjectModel/src/main/java/com/qa/features/FreeCRM.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Free CRM HomePage Test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-homepage-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Navigates Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User Enters Username and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Validate Home Page Title",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Validate LoggedIn UserName",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.User_opens_browser()"
});
formatter.result({
  "duration": 89504172927,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.User_Navigates_Login_Page()"
});
formatter.result({
  "duration": 681397530,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.User_Enters_Username_and_Password()"
});
formatter.result({
  "duration": 3779107971,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.Validate_Home_Page_Title()"
});
formatter.result({
  "duration": 87006222,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[CRMPRO]\u003e but was:\u003c[#1 Free CRM software in the cloud for sales and service]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat com.qa.StepDefinitions.HomePageSteps.Validate_Home_Page_Title(HomePageSteps.java:50)\r\n\tat ✽.Then Validate Home Page Title(C:/Users/sony/eclipse-workspace/CucumberPageObjectModel/src/main/java/com/qa/features/FreeCRM.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageSteps.Validate_LoggedIn_UserName()"
});
formatter.result({
  "status": "skipped"
});
});