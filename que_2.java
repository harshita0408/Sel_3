package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class que_2 {

	public que_2() {
		// TODO Auto-generated constructor stub
		public WebDriver driver;
	      
	      @BeforeClass
	      public void launchBrowser() {
	    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harshita Mishra\\eclipse-workspace\\selenium_project\\src\\main\\resources\\chromedriver.exe" );
		  	   driver = new ChromeDriver();
		  	   driver.get(" https://www.tothenew.com/");
		  	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	      }
		 @Test
		    public void Options_Service_Verify() {
		        action = new Actions(driver);
		        WebElement service = driver.findElement(By.xpath("(//a[@id='h-Services'])[2]"));
		        action.moveToElement(service).perform();
		        List<WebElement> ServiceDropDown = driver
		                .findElements(By.xpath("(//li[@class='menu-item menu-expanded'])[4]//ul/li"));
		        for (int i = 0; i < ServiceDropDown.size(); i++) {
		            System.out.println(ServiceDropDown.get(i).getText());
		            System.out.println("*********************************");
		        }
		        String S1 = ServiceDropDown.get(0).getText();
		        String S2 = ServiceDropDown.get(1).getText();
		        String S3 = ServiceDropDown.get(2).getText();
		        String S4 = ServiceDropDown.get(3).getText();
		        String S5 = ServiceDropDown.get(4).getText();
		        String S6 = ServiceDropDown.get(5).getText();

		        Assert.assertEquals(S1, "Digital Engineering");
		        Assert.assertEquals(S2, "Cloud & DevOps");
		        Assert.assertEquals(S3, "OTT Solutions & Services");
		        Assert.assertEquals(S4, "Data & Analytics");
		        Assert.assertEquals(S5, "CX, Content & Commerce");
		        Assert.assertEquals(S6, "Digital Marketing");

		    }

		    @AfterMethod
		    public void Close() {
		        driver.close();
		    }
	
	}

}
