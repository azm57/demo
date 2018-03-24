package com.epam.scenarios;

import org.testng.annotations.Test;

import com.epam.pageobjects.ObjectLibraryWrapper;
import com.epam.utils.Browser;
import com.epam.utils.ExcelUtil;

public class Craftsvilla 
{
	
	//@Test
	public static void UserRegistration() throws Exception 
	{
		//Launch Application
		Browser.setup("firefox");
		
		//Read Test Data
		ExcelUtil.gFunc_ReadTestData("D:\\Workspace\\SeleniumJavaFramework_new\\src\\test\\resources\\test_excelreading.xls", "Sheet1", "UsrRegistration");
		
		//User Registration
		ObjectLibraryWrapper.getObjCraftsvilla_Registration().UserRegistration();
		
		//Verify Registration
		ObjectLibraryWrapper.getObjCraftsvilla_Registration().VerifySuccessfulRegistration();	
	}
	

	@Test
	public static void CartList() throws Exception
	{
		//Launch Application
		Browser.setup("firefox");
		
		//Read Test Data
		ExcelUtil.gFunc_ReadTestData("D:\\Workspace\\SeleniumJavaFramework_new\\src\\test\\resources\\test_excelreading.xls", "Sheet1", "CartList");
		
		//Login to the application
		ObjectLibraryWrapper.getObjCraftsvilla_HomePage().Login();
		
		//NavToProdCategory
		ObjectLibraryWrapper.getObjCraftsvilla_HomePage().NavToProdCat();
		
		// Add products to Cart
		ObjectLibraryWrapper.getobjCraftsvilla_ProductDetails().addProductsToCart();
		
		//Nav to Cart
		ObjectLibraryWrapper.getObjCraftsvilla_Cart().navigateToCart();
		
		//Buy A Product
		ObjectLibraryWrapper.getObjCraftsvilla_Cart().verifyCartItems();
		
		Browser.getDriver().close();
	}
	
	//@Test
	public static void addItemsToWishlistAndVerify() throws Exception
	{
		//Launch Application
		Browser.setup("firefox");
		
		//Read Test Data
		ExcelUtil.gFunc_ReadTestData("D:\\Workspace\\SeleniumJavaFramework_new\\src\\test\\resources\\test_excelreading.xls", "Sheet1", "CartList");
		
		//Login to the application
		ObjectLibraryWrapper.getObjCraftsvilla_HomePage().Login();
		
		//Navigate to Product Category
		ObjectLibraryWrapper.getObjCraftsvilla_HomePage().NavToProdCat();
		
		//Add products to Wishlist
		ObjectLibraryWrapper.getobjCraftsvilla_ProductDetails().addProductsToWishlist();
		
		//Navigate to Wishlist
		ObjectLibraryWrapper.getobjCraftsvilla_wishlistPage().navigateToWishlist();
		
		//Verify Wishlist
		ObjectLibraryWrapper.getobjCraftsvilla_wishlistPage().VerifyWishlistItems();
	}
	
	
	

}