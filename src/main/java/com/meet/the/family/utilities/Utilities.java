package com.meet.the.family.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.HttpURLConnection;
import java.net.URL;

public class Utilities {

	public static void clickOnElement(WebElement element) {

		element.click();
	}

	public static void type(WebElement element, String text) {

		element.sendKeys(text);
	}

	public static void dropdownHandling(WebElement element, Object countries) {

		Select select = new Select(element);
		select.selectByVisibleText(countries.toString());
	}

	public static void mouseHover(WebElement element, WebDriver driver) {

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();
	}

	public static WebElement waitForElement(WebElement element, WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement e = wait.until(ExpectedConditions.visibilityOf(element));
		return e;
	}

	public static void clickOnElementUsingJavaScriptExcutor(WebElement element, WebDriver driver) {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeAsyncScript("arguments[0].click;", element);
	}

	public static void scrollDownUsingJavaScriptExecutor(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeAsyncScript("window.scrollBy(0,1000)");

	}

	public static void verifyLinkActive(String linkUrl) {
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

			httpURLConnection.setConnectTimeout(3000);

			httpURLConnection.connect();

			if (httpURLConnection.getResponseCode() == 200) {
				System.out.println(url + " is a valid link");
			} else if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {

				System.out.println(linkUrl + "-" + HttpURLConnection.HTTP_NOT_FOUND);
			}

		} catch (Exception e) {

		}

	}
}
