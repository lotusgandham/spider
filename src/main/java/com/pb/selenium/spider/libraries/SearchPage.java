package com.pb.selenium.spider.libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.pb.selenium.spider.libraries.SearchResultsPage;;

public class SearchPage {
	
	//declare any objects findby annotations here
//	@FindBy(how = How.NAME, using = "q")
//    private WebElement searchField;
//	
	private WebDriver driver;

	public SearchPage(WebDriver driver){	
		//initilise objects used on the page--if using object map
		//initialise any report objects
		//place any objects when the page loads here
		
		this.driver = driver;
	}
	
	public SearchResultsPage searchText(String text){
		
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys(text);
		searchField.submit();
		
		//on success
		
		return PageFactory.initElements(driver, SearchResultsPage.class);
	}
	
}
