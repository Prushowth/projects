package com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration {
	
	public void employeeReg() throws IOException, AWTException {
		
		String BaseUrl = "D:\\Simplilearn\\Phase 5-Testing\\eclipse-workspace-testing\\UserRegistration.html";
		ChromeWebDriver1 cd1 = new ChromeWebDriver1();
		WebDriver driver = cd1.driverChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.get(BaseUrl);
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
//		StringSelection str = new StringSelection("D:\\Simplilearn\\Phase 5-Testing\\registration.txt");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
		FileReader fr=new FileReader("D:\\Simplilearn\\Phase 5-Testing\\registration.txt"); 
		BufferedReader br=new BufferedReader(fr); 
		String s1 = br.readLine();
		System.out.println(s1);
		
		List list1 = new ArrayList ();

		if(s1.isEmpty()){
			System.out.println("enter the string");
		}else {
			String array1[] = s1.split(",");
			list1 = Arrays.asList(array1);
		}
	System.out.println(list1);
	
	System.setProperty("java.awt.headless", "false");
	Robot rb = new Robot();
	
	String eID1 = (String) list1.get(0);
	WebElement eID = driver.findElement(By.xpath("/html/body/form/div/input[1]"));
	eID.sendKeys(eID1);
	
	String fName1 = (String) list1.get(0);
	WebElement fName = driver.findElement(By.xpath("/html/body/form/div/input[2]"));
	fName.sendKeys(fName1);
	
	String lName1 = (String) list1.get(1);
	WebElement lName = driver.findElement(By.xpath("/html/body/form/div/input[3]"));
	lName.sendKeys(lName1);
	
	String phoneNo1 = (String) list1.get(2);
	WebElement phoneNo = driver.findElement(By.xpath("/html/body/form/div/input[4]"));
	phoneNo.sendKeys(phoneNo1);
	
	String email1 = (String) list1.get(3);
	WebElement email = driver.findElement(By.xpath("/html/body/form/div/input[5]"));
	email.sendKeys(email1);
	
	String department1 = (String) list1.get(4);
	WebElement department = driver.findElement(By.xpath("/html/body/form/div/input[6]"));
	department.sendKeys(department1);
	
	String location1 = (String) list1.get(5);
	WebElement location = driver.findElement(By.xpath("/html/body/form/div/input[7]"));
	location.sendKeys(location1);
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement submit1 = driver.findElement(By.xpath("/html/body/form/div/button"));
	submit1.click();

	}
	
	public void login1() throws IOException, AWTException {
		
		String BaseUrl = "D:\\Simplilearn\\Phase 5-Testing\\eclipse-workspace-testing\\loginPage.html";
		ChromeWebDriver1 cd1 = new ChromeWebDriver1();
		WebDriver driver = cd1.driverChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.get(BaseUrl);
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		FileReader fr=new FileReader("D:\\Simplilearn\\Phase 5-Testing\\userLogin.txt"); 
		BufferedReader br=new BufferedReader(fr); 
		String s1 = br.readLine();
		System.out.println(s1);
		
		List list1 = new ArrayList ();

		if(s1.isEmpty()){
			System.out.println("enter the string");
		}else {
			String array1[] = s1.split(",");
			list1 = Arrays.asList(array1);
		}
		
		System.out.println(list1);
		
		String empID = (String) list1.get(0);
		WebElement eID = driver.findElement(By.xpath("/html/body/form/div/div/input[1]"));
		eID.sendKeys(empID);
		
		String moblie1 = (String) list1.get(1);
		WebElement mobile = driver.findElement(By.xpath("/html/body/form/div/div/input[2]"));
		mobile.sendKeys(moblie1);
		
		String email1 = (String) list1.get(2);
		WebElement email = driver.findElement(By.xpath("/html/body/form/div/div/input[3]"));
		email.sendKeys(email1);
		
		System.setProperty("java.awt.headless", "false");
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement submit1 = driver.findElement(By.xpath("/html/body/form/div/div/button"));
		submit1.click();

		}
		
	}

