package com.edureka.devops.selenium_200510;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
//import org.testng.annotations.Test; 
//import org.testng.Assert; 

/**
 * Unit test for simple App.
 */

public class AppTest{
	
	@Test 
    public void testBoldValue(){
		
		System.setProperty("webdriver.gecko.driver","geckodriver"); 
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		options.addArguments("-headless");
		WebDriver driver = new FirefoxDriver(options);
		driver.get("http://localhost:81/content/about-us.php"); 
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  
		String expectedBoldValue = "about";
		String actualBoldValue = driver.findElement(By.xpath("/html/body/p[1]/b")).getText();
		Assert.assertEquals(expectedBoldValue, actualBoldValue);
		driver.close();

    }
}	
