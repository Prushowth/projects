package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class ImdbData {
		
		public void movieData() {
			
			String BaseUrl = "https://www.imdb.com";
			ChromeWebDriver1 cd1 = new ChromeWebDriver1();
			WebDriver driver = cd1.driverChromeDriver();
			
			driver.manage().window().maximize();
			driver.get(BaseUrl);
			driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);


	}

}
