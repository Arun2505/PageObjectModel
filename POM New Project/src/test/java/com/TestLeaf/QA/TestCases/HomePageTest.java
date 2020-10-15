package com.TestLeaf.QA.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestLeaf.QA.Base.TestBase;
import com.TestLeaf.QA.Pages.HomePage;
import com.TestLeaf.QA.Pages.LoginPage;

public class HomePageTest extends TestBase {
	
	
	
	LoginPage loginpage;
	HomePage homepage;

	public HomePageTest() {
			super();
		}

	@BeforeMethod
	public void setUp() {
		initialization();
		homepage = new HomePage();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test
	public void Logo() {
		System.out.println("");
		
	}
	
	@Test
	public void Home_page_Test() {
		
		homepage.Home_page("BSS", "AK", "Arun");
		
				
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}








