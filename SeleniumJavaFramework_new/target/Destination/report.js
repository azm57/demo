$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyApp.feature");
formatter.feature({
  "line": 1,
  "name": "Creaftsvilla Application",
  "description": "",
  "id": "creaftsvilla-application",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: User Registration"
    },
    {
      "line": 5,
      "value": "#Given Launch Browser and navigate to application"
    },
    {
      "line": 6,
      "value": "#And Read Test Data"
    },
    {
      "line": 7,
      "value": "#When Go to registration and enter all the data and click register"
    },
    {
      "line": 8,
      "value": "#Then Verify successful registration"
    }
  ],
  "line": 11,
  "name": "Add Products To Cart and Verify",
  "description": "",
  "id": "creaftsvilla-application;add-products-to-cart-and-verify",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Launch Browser and navigate to application",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Read Test Data",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User Login to Application with valid Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User navigates to Product Category Page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User Adds products to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User Navigates to Cart",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Verify the Cart Items",
  "keyword": "And "
});
formatter.match({
  "location": "MyAppStepDefinitions.Launch_Browser_and_navigate_to_application()"
});
formatter.result({
  "duration": 21420038777,
  "status": "passed"
});
formatter.match({
  "location": "MyAppStepDefinitions.Read_Test_Data()"
});
formatter.result({
  "duration": 438179069,
  "status": "passed"
});
formatter.match({
  "location": "MyAppStepDefinitions.User_Login_to_Application_with_valid_Credentials()"
});
formatter.result({
  "duration": 19687596643,
  "error_message": "com.epam.utils.CustomeExceptionUtil: Email Field not found\r\n\tat com.epam.pageobjects.Craftsvilla_HomePage.Login(Craftsvilla_HomePage.java:61)\r\n\tat StepDefinition.MyAppStepDefinitions.User_Login_to_Application_with_valid_Credentials(MyAppStepDefinitions.java:46)\r\n\tat ✽.When User Login to Application with valid Credentials(MyApp.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyAppStepDefinitions.User_navigates_to_Product_Category_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyAppStepDefinitions.User_Adds_products_to_the_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyAppStepDefinitions.User_Navigates_to_Cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyAppStepDefinitions.Verify_the_Cart_Items()"
});
formatter.result({
  "status": "skipped"
});
});