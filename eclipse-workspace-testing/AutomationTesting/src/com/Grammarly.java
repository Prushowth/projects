package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class Grammarly {
	
public void plagiarismChecker() throws InterruptedException, AWTException {
		
		String BaseUrl = "https://www.grammarly.com/plagiarism-checker";
		ChromeWebDriver1 cd1 = new ChromeWebDriver1();
		WebDriver driver = cd1.driverChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.get(BaseUrl);
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		
		Thread.sleep(2000);
		WebElement browse = driver.findElement(By.className("_3255a-uploadButton"));
		
		browse.click();
		Thread.sleep(2000);
		
		System.setProperty("java.awt.headless", "false");
		Robot rb = new Robot();
		
		StringSelection str = new StringSelection("D:\\Simplilearn\\Phase 5-Testing\\same.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);	
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebElement submit1 = driver.findElement(By.xpath("//*[@id=\'checktext\']/div[2]/div[1]/div[2]/div/div[2]/button"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\\'checktext\\']/div[2]/div[1]/div[2]/div/div[2]/button")).getText());
		
		submit1.click();
		
		System.out.println("end of code");
		
	}

}
