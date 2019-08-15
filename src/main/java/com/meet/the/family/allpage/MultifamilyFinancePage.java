package com.meet.the.family.allpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.meet.the.family.pageObjects.PageLocators;
import com.meet.the.family.utilities.Utilities;

public class MultifamilyFinancePage {
	WebDriver driver;

	public MultifamilyFinancePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	PageLocators pagelocators = new PageLocators();

	public void multiFamilyFinancePageVerification() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Assert.assertTrue(driver.getCurrentUrl().equals(PageVerificationContents.PageVerification.COMMERCIAL_PAGE_URL));

	}

	public MultifamilyFinanceTeamPage clickOnMeetTheMultiFamilyTeamButton() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Utilities.clickOnElementUsingJavaScriptExcutor(pagelocators.commercialRealEstateSubMenu(), driver);
		return new MultifamilyFinanceTeamPage(driver);
	}

}
