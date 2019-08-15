package com.meet.the.family.browser.config;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.meet.the.family.support.ConfigFIle;

public class BrowserConfigaration {

	public static WebDriver driver;

	public static void openBrowser() throws IOException {
		Properties configPath = ConfigFIle.loadPropertyFile(
				"/Users/muniaakter/eclipse-NEW/capitalOne.meet.The.Family/src/main/java/com/meet/the/family/support/ConfigFIle.java");
		String browsername = configPath.getProperty("browser");
		String browserVersion = configPath.getProperty("version");
		String testEnviorment = configPath.getProperty("enviroment");

		if (browsername.toLowerCase().equals("chrome")) {
			if (browserVersion.equals("75")) {
				if (testEnviorment.toLowerCase().equals("qa")) {
					System.setProperty("webdriver.chrome.driver", "/Users/muniaakter/Downloads/chromedriver");
					driver = new ChromeDriver();
				}

			}
		} else if (browsername.toLowerCase().equals("chrome")) {
			if (browserVersion.equals("")) {
				if (testEnviorment.toLowerCase().equals("qa")) {
					System.setProperty("webdriver.gecko.driver",
							"/Users/muniaakter/Downloads/SeleniumServer/gechodriver");
					driver = new FirefoxDriver();
				}
			}

		} else if (browsername.toLowerCase().equals("ie")) {
			if (browserVersion.equals("")) {
				if (testEnviorment.toLowerCase().equals("qa")) {
					System.setProperty("webdriver.ie.driver", "/Users/muniaakter/Downloads/SeleniumServer/gechodriver");
					driver = new FirefoxDriver();
				}
			}

		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(configPath.getProperty("url"));

	}

	public static void closeBrowser() {
		driver.close();
	}

}
