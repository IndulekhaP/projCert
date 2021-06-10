package com.edureka.devops.selenium_200510;
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
//import org.testng.annotations.Test; 
//import org.testng.Assert; 

public class App 
{
//	@Test 
	public static void main(String[] args) { 
		System.setProperty("webdriver.gecko.driver","geckodriver"); 
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		options.addArguments("-headless");
		WebDriver driver = new FirefoxDriver(options);
		driver.get("http://localhost:81/"); 
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
        //driver.close();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"About Us\"]")).click(); //click();
        // driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Hello Facebook");


		//Thread.sleep(5000); driver.quit(); 
	}
}


//driver.findElement(By.className("v-button")).click(); 
//driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka"); 
//driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps"); 
//driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562709"); 
//driver.findElement(By.id("gwt-uid-11")).sendKeys("Devops@edureka.co"); 
//driver.findElement(By.id("gwt-uid-13")).sendKeys("3/3/21,"); 
//driver.findElement(By.className("v-button-primary")).click(); 