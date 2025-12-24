package com.ninzacrm.campaigntest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://49.249.28.218:8098/");
		driver.manage().window().maximize();
		
		WebElement UN=driver.findElement(By.id("username"));
		UN.sendKeys("rmgyantra");
		WebElement PW=driver.findElement(By.id("inputPassword"));
		PW.sendKeys("rmgy@9999");
		WebElement LNBTN=driver.findElement(By.xpath("//button[@type='submit']"));
		LNBTN.click();
		WebElement CCBTN=driver.findElement(By.xpath("//a[text()='Campaigns']"));
		CCBTN.click();
		WebElement CC=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		CC.click();
		Thread.sleep(2000);
	}

}
