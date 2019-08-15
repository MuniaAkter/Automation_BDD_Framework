package com.meet.the.family.allpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.meet.the.family.allpages.verification.contents.PageVerificationContents;
import com.meet.the.family.allpages.verification.contents.PageVerificationContents.PageVerification;
import com.meet.the.family.pageObjects.PageLocators;
import com.meet.the.family.utilities.Utilities;

public class CommercialPage {
WebDriver driver;
	public CommercialPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}

	PageLocators pagelocators = new PageLocators();
	
	
	public void commercialPageVerification() {
	//	Assert.assertTrue(driver.getCurrentUrl().equals(PageVerificationContents.PageVerification.COMMERCIAL_PAGE_URL));

		
	}
	
	public CommercialRealEstatePage clickOnCommercialMenu() {
		Utilities.clickOnElementUsingJavaScriptExcutor(pagelocators.commercialRealEstateSubMenu(), driver);
		return new CommercialRealEstatePage(driver);
	}
}
