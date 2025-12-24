package com.ninzacrm.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaign {
	
	 WebDriver driver=null;
	 
	public CreateCampaign(WebDriver driver) { 
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
	}
	
	
	  // @FindBy(xpath="//a[@href='/campaigns']")
	    //private WebElement Campaigns_Btn;
	 
		//@FindBy(name="username")
	    //private WebElement loginid;
	    
	    
	   // @FindBy(id="inputPassword")
	    //private WebElement Password;
	    
	    
//	    @FindBy(xpath="//button[@type='submit']")
//	    private WebElement signbtn;
//	    
//	    @FindBy(linkText="Campaigns")
//		private WebElement campaigns;
//	    
//	    @FindBy(xpath="//a[@href='/campaigns']")
//	    private WebElement Campaignlink;
//		
//	    
//	    @FindBy(xpath="//button[@class='btn btn-info']")
//	    private WebElement cratecampaignbtn;
	    
	
		@FindBy(name="campaignName")
		private WebElement Cname;
		
		
//		@FindBy(name="campaignStatus")
//		private WebElement Cstatus;
		
		
		@FindBy(name="targetSize")
		private WebElement Tsize;
		
		
//		@FindBy(name="expectedCloseDate")
//		private WebElement ExCloseDate;
//		
		
		@FindBy(name="targetAudience")
		private WebElement TAudience;
		
		
		@FindBy(name="description")
		private WebElement Description;
		
		
		@FindBy(xpath="//button[@type='submit']")
		private WebElement CCBtn;

		public WebDriver getDriver() {
			return driver;
		}


//		public WebElement getCampaigns_Btn() {
//			return Campaigns_Btn;
//		}
//
//
//		public WebElement getLoginid() {
//			return loginid;
//		}
//
//
//		public WebElement getPassword() {
//			return Password;
//		}


//		public WebElement getSignbtn() {
//			return signbtn;
//		}
//
//
//		public WebElement getCampaigns() {
//			return campaigns;
//		}
//
//
//		public WebElement getCampaignlink() {
//			return Campaignlink;
//		}
//
//
//		public WebElement getCratecampaignbtn() {
//			return cratecampaignbtn;
//		}


		public WebElement getCname() {
			return Cname;
		}


//		public WebElement getCstatus() {
//			return Cstatus;
//		}


		public WebElement getTsize() {
			return Tsize;
		}


//		public WebElement getExCloseDate() {
//			return ExCloseDate;
//		}


		public WebElement getTAudience() {
			return TAudience;
		}


		public WebElement getDescription() {
			return Description;
		}


		public WebElement getCCBtn() {
			return CCBtn;
		}
		
		

		
		

		

}
