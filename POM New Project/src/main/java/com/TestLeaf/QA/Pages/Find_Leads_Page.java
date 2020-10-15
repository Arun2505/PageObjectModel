package com.TestLeaf.QA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.TestLeaf.QA.Base.TestBase;

public class Find_Leads_Page extends TestBase {
	
	
	@FindBy(how = How.XPATH,using="((//div//div//div//div//ul//li))[3]")
	WebElement Choose_Find_Lead;

	@FindBy(how = How.NAME,using="firstName")
	WebElement firstname;
	
	@FindBy(how = How.NAME,using="lastName")
	WebElement lastname;
	
	@FindBy(how = How.NAME,using="companyName")
	WebElement companyname;
	
	@FindBy(how = How.XPATH,using="//*[@id=\"ext-gen242\"]")
	WebElement Click_Find_Lead;
	
	public Find_Leads_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public Merge_Leads_page FindLeads(String fn,String Ln,String ComName) {
		Choose_Find_Lead.click();
		firstname.sendKeys(fn);
		lastname.sendKeys(Ln);
		companyname.sendKeys(ComName);
		Click_Find_Lead.click();
		
		return new Merge_Leads_page();
		
	}

}





