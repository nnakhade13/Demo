package com.ninzacrm.pomclass;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;



public class BaseClass {
	 protected WebDriver driver;
	
	@BeforeSuite
	
	public void beforesuite() {
		Reporter.log("Connecting to Db", true);
	}
	@AfterSuite
	public void aftersuit() {
		Reporter.log("Closing DB",true);
	}


	
	@BeforeClass
	public void beforeclass() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	}
	@AfterClass
	public void afterclass() {
		//driver.quit();
	}
	
	@BeforeMethod
	public void beforemethod() throws IOException, InterruptedException {
		driver.get("http://49.249.28.218:8098");
		LoginPage LP = new LoginPage(driver);
		LP.getUN().sendKeys("rmgyantra");
		LP.getPass().sendKeys("rmgy@9999");
		LP.getSigninBtn().click();
     	Thread.sleep(3000);
//		FileUtility fUtil=new FileUtility();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
//		String URL = fUtil.toGetDataFromProperties("url");
//		String USERNAME = fUtil.toGetDataFromProperties("username");
//		String PASSWORD = fUtil.toGetDataFromProperties("password");
//		driver.get(URL);
//	com.ninzacrm.pomclass.CreateCampaign cp=new com.ninzacrm.pomclass.CreateCampaign(driver);
//	cp.getLoginid().sendKeys(USERNAME);
//	cp.getPassword().sendKeys(PASSWORD);	
//	cp.getSignbtn().click();	
//		
//		
//		Thread.sleep(10000);
	}
	@AfterMethod
	public void aftermethod() {
		Reporter.log("logout",true);
	}
	
	
	}
