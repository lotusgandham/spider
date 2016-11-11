package com.pb.selenium.spider.libraries;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class TFLHome {
	
	@FindBy(xpath="(//a[@href='#jp-new'])[1]")
	private WebElement newTab; 
	
	@FindBy(id="InputFrom")
	private WebElement from; 
	
	@FindBy(id="InputTo")
	private WebElement to; 
	
	@FindBy(xpath="//input[@value='Plan my journey']")
	private WebElement plan;
	
	public void planMyJourney(String fromStr, String toStr){
		from.sendKeys(fromStr);
		to.sendKeys(toStr);
//		plan.submit();
		Reporter.log("this is test");
	}
}
