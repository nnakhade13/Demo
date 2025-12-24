package com.ninzacrm.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver= null;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Campaigns")
	private WebElement campaignslink;
	
	@FindBy(xpath="//span[text()='Create Campaign']")
	private WebElement createCampaignBtn;
	
	
	
	public WebDriver getDriver() {
		return driver;
	    }
		public WebElement getCampaignslink() {
			return campaignslink;
		}
		public WebElement getCreateCampaignBtn() {
			return createCampaignBtn;
	}
}
