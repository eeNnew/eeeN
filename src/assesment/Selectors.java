package assesment;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;

import org.openqa.selenium.support.PageFactory;
public class Selectors {
	
	

	    WebDriver driver;

	  
	    @FindBy(name="query")
	    WebElement searchField;

	    @FindBy (name="query")

	    WebElement link;    

	   

	    public void start(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	   
	    public void search (String searchField){

	    driver.findElement(By.name("query")).sendKeys("groupchat");

	    }

	    public void clickFoundLink(String link){

	    driver.findElement(By.name("query")).click();

	    }
	    public void doTheTest(String searchField, String link) {
	    	this.search(searchField);
	    	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	        driver.navigate().to("https://support.wire.com/hc/en-us/search?utf8=%E2%9C%93&query=groupchat");
	    	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	this.clickFoundLink(link);
	    }

	}
	
