package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverChromedriver {
	
	public WebDriver driverChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "D:/selenium dependency/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
