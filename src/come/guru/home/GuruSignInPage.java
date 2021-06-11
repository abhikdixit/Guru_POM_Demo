package come.guru.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuruSignInPage {

private WebDriver driver;
	
	public GuruSignInPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public boolean verifySignInPageTitle() {
		String expectedTitle = "Guru99 Bank Manager HomePage";
		return getSignInPageTitle().contains(expectedTitle);
	}
	public String getSignInPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	public boolean verifySignInPageText() {
		WebElement element = driver.findElement(By.linkText("Manager"));	
		String pageText = element.getText();
		String expectedPageText = "Manager";
		return pageText.contains(expectedPageText);
	}

	public boolean verifySignInPageURL() {
		String pageText = driver.getCurrentUrl();
		String expectedPageURL = "http://demo.guru99.com/v4/manager/Managerhomepage.php";
		return pageText.contains(expectedPageURL);
	}
}
