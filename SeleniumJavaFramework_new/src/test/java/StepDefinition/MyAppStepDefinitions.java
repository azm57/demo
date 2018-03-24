package StepDefinition;

import org.openqa.selenium.WebDriver;

import com.epam.pageobjects.ObjectLibraryWrapper;
import com.epam.utils.Browser;
import com.epam.utils.ExcelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyAppStepDefinitions {

WebDriver Driver;


	@Given("^Launch Browser and navigate to application$")
	public void Launch_Browser_and_navigate_to_application() throws Throwable {
		//Launch Application
		Browser.setup("firefox");
	}
	
	@Given("^Read Test Data$")
	public void Read_Test_Data() throws Throwable {
		//Read Test Data
		ExcelUtil.gFunc_ReadTestData("D:\\Workspace\\SeleniumJavaFramework_new\\src\\test\\resources\\test_excelreading.xls", "Sheet1", "UsrRegistration");
	}
	
	@When("^Go to registration and enter all the data and click register$")
	public void Go_to_registration_and_enter_all_the_data_and_click_register() throws Throwable {
		//User Registration
		ObjectLibraryWrapper.getObjCraftsvilla_Registration().UserRegistration();
	}
	
	@Then("^Verify successful registration$")
	public void Verify_successful_registration() throws Throwable {
		//Verify Registration
		ObjectLibraryWrapper.getObjCraftsvilla_Registration().VerifySuccessfulRegistration();
	}

	// Cart List Definitions
	@When("^User Login to Application with valid Credentials$")
	public void User_Login_to_Application_with_valid_Credentials() throws Throwable {
		//Login to the Application
		ObjectLibraryWrapper.getObjCraftsvilla_HomePage().Login();
	}

	@When("^User navigates to Product Category Page$")
	public void User_navigates_to_Product_Category_Page() throws Throwable {
		//Navigate to Product Category page
		ObjectLibraryWrapper.getObjCraftsvilla_HomePage().NavToProdCat();
	}

	@When("^User Adds products to the cart$")
	public void User_Adds_products_to_the_cart() throws Throwable {
		//Add products to Cart
		ObjectLibraryWrapper.getobjCraftsvilla_ProductDetails().addProductsToCart();
	}

	@Then("^User Navigates to Cart$")
	public void User_Navigates_to_Cart() throws Throwable {
		//Navigate to Cart
		ObjectLibraryWrapper.getObjCraftsvilla_Cart().navigateToCart();
	}

	@Then("^Verify the Cart Items$")
	public void Verify_the_Cart_Items() throws Throwable {
		//Validate the Cart Items
		ObjectLibraryWrapper.getObjCraftsvilla_Cart().verifyCartItems();
	}
}