package com.TestLeaf.QA.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestLeaf.QA.Base.TestBase;
import com.TestLeaf.QA.Pages.Find_Leads_Page;
import com.TestLeaf.QA.Pages.HomePage;
import com.TestLeaf.QA.Pages.LoginPage;

public class FindLeadsPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	Find_Leads_Page find_lead_page;

	public FindLeadsPageTest() {
			super();
		}

	@BeforeMethod
	public void setUp() {
		initialization();
		homepage = new HomePage();
		loginpage = new LoginPage();
		find_lead_page = new Find_Leads_Page();
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Test(priority=1)
	public void homepage() {
		homepage.Home_page("BSS", "AK", "Arun");
	}
	
	@Test(priority=2)
	public void find_Leads() throws InterruptedException {
		homepage.Home_page("BSS", "AK", "Arun");
		find_lead_page.FindLeads("BSS", "AK", "Arun");
		
		System.out.println("Every Test Cases got passed and Thnaks to all...");
		
	}
	


@AfterMethod
public void closeBro() {
	driver.close();
}

}