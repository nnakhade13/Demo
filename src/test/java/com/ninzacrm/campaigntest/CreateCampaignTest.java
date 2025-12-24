package com.ninzacrm.campaigntest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ninzacrm.genericutility.ExcelUtility;
import com.ninzacrm.pomclass.BaseClass;
import com.ninzacrm.pomclass.HomePage;


public class CreateCampaignTest extends BaseClass {
	WebDriver driver;
	/*
	 * create campaign
	 * @author Nilam
	 */
	@Test
	public void toCreateCampaign() throws InterruptedException, EncryptedDocumentException, IOException {
	 
	 HomePage hp= new HomePage(driver);
	 
      hp.getCampaignslink().click();
      
      Thread.sleep(3000);
      
      hp.getCreateCampaignBtn().click();
     
	  ExcelUtility eUtil=new ExcelUtility();
	  String CNAME = eUtil.toGetDataFromExcel("CAMPAIGN", 0, 1);
      //String TSIZE=eUtil.toGetDataFromExcel("CAMPAIGN", 0, 3);
      //String TAUDI=eUtil.toGetDataFromExcel("CAMPAIGN", 0, 5);

      
      
      com.ninzacrm.pomclass.CreateCampaign cp=new com.ninzacrm.pomclass.CreateCampaign(driver);
      cp.getCname().sendKeys(CNAME);
      //cp.getTsize().sendKeys(TSIZE);
      //cp.getTAudience().sendKeys("People");
      cp.getCCBtn().click();
               
	}

}
