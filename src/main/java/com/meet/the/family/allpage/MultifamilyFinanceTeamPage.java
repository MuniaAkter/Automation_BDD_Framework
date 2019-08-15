package com.meet.the.family.allpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.meet.the.family.pageObjects.PageLocators;

public class MultifamilyFinanceTeamPage {
	WebDriver driver;

	public MultifamilyFinanceTeamPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	PageLocators pagelocators = new PageLocators();

	public void multiFamilyFinanceTeamPageVerification() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Assert.assertTrue(driver.getCurrentUrl().equals(PageVerificationContents.PageVerification.COMMERCIAL_PAGE_URL));

	}

}
