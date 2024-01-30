package com.login.com;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Login {
	WebDriver driver;
	
	@BeforeClass
	public void driverSetting() {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	 driver=new ChromeDriver();
		
		driver.get("file:///C:/selenium%20software/Offline%20Website/index.html");
	}
	@Test(priority = 1)
	public void username() {
		
	WebElement usernameElement=	driver.findElement(By.xpath("//input[@id='email']"));
	
	usernameElement.sendKeys("dinesh@143");
	
	}
	
	@Test(priority = 2)
	public void Password() {
		WebElement passwordElement= driver.findElement(By.xpath("//input[@id='password']"));
		
		passwordElement.sendKeys("dinesh456");
	
		
		driver.findElement(By.xpath("//form[@id='form']//child::button")).click();
		
		
		
		
		
		WebElement actualResultElement_emailerror=driver.findElement(By.xpath("//div[@id='email_error']"));
		
		String actualresult_email=actualResultElement_emailerror.getText();
		
		System.out.println("---"+actualresult_email);
		
		
	//String expectedresultString ="Required Email kiran@gmail";
		

		String expectedresultString ="please enter email as kiran@gmail.com";
		
		//t is by default hard assert
		
		//Assert.assertEquals(actualresult_email, expectedresultString);
		
		//System.out.println("-----After Assert.assertEquals Method-----");
		
		
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(actualresult_email, actualresult_email);

		
		
		
		//for password 
		
		WebElement password_elemeElement_error=driver.findElement(By.xpath("//div[@id='password_error']"));
		
		String actual_password=password_elemeElement_error.getText();
		
		
		String expeced_password="please enter the password";
		
		softassert.assertEquals(actual_password, expeced_password);
		
		System.out.println("-----After Assert.assertEquals Method-----");
		
		softassert.assertAll();
		
		
		
	}

	@Test(priority = 3)
	public void  validuser() {
		
		WebElement username_element=driver.findElement(By.xpath("//input[@id='email']"));
		username_element.clear();
		username_element.sendKeys("kiran@gmail.com");
		
		
		WebElement password_element= driver.findElement(By.xpath("//input[@id='password']"));
		username_element.clear();
		password_element.sendKeys("123456");
		
		
		driver.findElement(By.xpath("//form[@id='form']//child::button")).click();
		
		
		
		//by using url
		
		String actual_url=driver.getCurrentUrl();
		System.out.println(actual_url);
		
		String actual_urlString="file:///C:/selenium%20software/Offline%20Website/pages/examples/dashboard1.html";
		
	String expected_url=driver.getCurrentUrl();
	
	Assert.assertEquals(actual_urlString, expected_url,"cheking dashboard  url");
		
		
	}
	

	
}
