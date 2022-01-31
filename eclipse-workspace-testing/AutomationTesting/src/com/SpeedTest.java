package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpeedTest {
	
	public void speedTest() {
		
		String BaseUrl = "https://www.speakeasy.net/speedtest";
		ChromeWebDriver1 cd1 = new ChromeWebDriver1();
		WebDriver driver = cd1.driverChromeDriver();
		
		driver.get(BaseUrl);
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).getTagName());
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/div[2]/main/div[1]")));
		System.out.println(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/main/div[1]")).getTagName());

//		System.out.println(driver.findElement(By.xpath("//*[@id=\'main-content\']/div[1]/div/button")).getTagName());
		
		
	}

}
