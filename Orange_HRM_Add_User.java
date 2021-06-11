package pk_orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orange_HRM_Add_User {

@Test
	//This is for Sign On Functionality
	public void Sign_On()
		
		{
			System.setProperty("webdriver.chrome.driver","D:/F Drive/Selenium Training Data/workspace/Maven_OrangeHRM/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			String Element = driver.findElement(By.linkText("Dashboard")).getText();
			System.out.println(Element);
			
			driver.findElementByLinkText("").click();
			driver.findElementByLinkText("").click();
			driver.findElementByLinkText("").click();
			
			driver.close();//Close will close only current chrome browser
		}
	
	
}
