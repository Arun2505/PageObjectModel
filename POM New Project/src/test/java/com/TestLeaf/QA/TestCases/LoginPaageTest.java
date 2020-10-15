package com.TestLeaf.QA.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestLeaf.QA.Base.TestBase;
import com.TestLeaf.QA.Pages.HomePage;
import com.TestLeaf.QA.Pages.LoginPage;



public class LoginPaageTest extends TestBase {
	
LoginPage loginpage;
HomePage homepage;
	
	public LoginPaageTest() {
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage(); 	
	}
	
	
	@Test(priority=1)
	public void LoginPageTitleTest() {
		String title = loginpage.Login_Title();
		System.out.println(title);
	}
	
	@Test(priority=2)
	public void TestLeafLogo() {
		boolean flag = loginpage.ValidateTestLeafLogo();
		
	}
	
	@Test(priority=3)
	public void logintest() {
		
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	

}








