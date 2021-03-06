package com.pb.selenium.spider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pb.selenium.spider.libraries.SearchPage;
import com.pb.selenium.spider.libraries.SearchResultsPage;

public class seleniumTest1 {
	public static void main(String[] args) {
		System.out.println("This is my first selenium test");
		
		// Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
		//
        WebDriver driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // And now use this to visit Google
        driver.get("https://tfl.gov.uk/");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

//        // Find the text input element by its name
//        WebElement element = driver.findElement(By.name("q"));
//
//        // Enter something to search for
//        element.sendKeys("Cheese!");
//
//        // Now submit the form. WebDriver will find the form for us from the element
//        element.submit();
//
//        // Check the title of the page
//        System.out.println("Page title is: " + driver.getTitle());
//        
//        // Google's search is rendered dynamically with JavaScript.
//        // Wait for the page to load, timeout after 10 seconds
//        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver d) {
//                return d.getTitle().toLowerCase().startsWith("cheese!");
//            }
//        });
        
//        SearchPage pg = new SearchPage(driver);
//        SearchResultsPage pg1 = pg.searchText("spiderman");

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
        
//        WebElement w = driver.findElement(By.xpath("(//a[@href='#jp-new'])[1]"));
        WebElement w = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[@href='#jp-new'])[1]")));
        
        w.click();
        
        
        
        //Close the browser
       // driver.quit();
	}
}
