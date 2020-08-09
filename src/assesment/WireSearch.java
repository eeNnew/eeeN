/**
 * 
 */
package assesment;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;


   public class WireSearch {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * 
	 *
	 */ 
	   
	 
	   WebDriver driver;
	   @Before
	    public void SetDriver() {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://support.wire.com/hc/en-us");
        driver.manage().window().maximize();
        
     }
	   @Test
        public void  doTheTest (String searchField, String link) {
        Selectors obj = new Selectors();
        obj.search(searchField);
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.navigate().to("https://support.wire.com/hc/en-us/search?utf8=%E2%9C%93&query=groupchat");
        //write a search term in the search field
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        obj.clickFoundLink(link);
        driver.close();
        }
	   
	}
   
