package com.meet.the.family.config.page.object.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.meet.the.family.allpage.CommercialPage;
import com.meet.the.family.allpage.CommercialRealEstatePage;
import com.meet.the.family.allpage.Homepage;
import com.meet.the.family.allpage.MultifamilyFinancePage;
import com.meet.the.family.allpage.MultifamilyFinanceTeamPage;

public class PageObjectManager {
	WebDriver driver;

	private Homepage homePage;
	private CommercialPage CommercialPage;
	private CommercialRealEstatePage CommercialRealEstatePage;
	private MultifamilyFinancePage MultifamilyFinancePage;
	private MultifamilyFinanceTeamPage MultifamilyFinanceTeamPage;

	/*----------Constructor---------*/
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}/*----------End of Constructor---------*/

	// Homepage homepage = new Homepage (driver);

	public Homepage getHomePage() {
		return (homePage == null) ? new Homepage(driver) : homePage;

	}

	public CommercialPage getCommercialPage() {
		return (CommercialPage == null) ? new CommercialPage(driver) : CommercialPage;

	}

	public CommercialRealEstatePage getCommercialRealEstatePage() {
		return (CommercialRealEstatePage == null) ? new CommercialRealEstatePage(driver) : CommercialRealEstatePage;

	}

	public MultifamilyFinancePage getMultifamilyFinancePage() {
		return (MultifamilyFinancePage == null) ? new MultifamilyFinancePage(driver) : MultifamilyFinancePage;

	}

	public MultifamilyFinanceTeamPage getMultifamilyFinanceTeamPage() {
		return (MultifamilyFinanceTeamPage == null) ? new MultifamilyFinanceTeamPage(driver)
				: MultifamilyFinanceTeamPage;

	}

}
