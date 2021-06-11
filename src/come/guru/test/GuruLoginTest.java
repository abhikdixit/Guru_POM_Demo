package come.guru.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.guru.common.GuruBasePage;
import com.guru.common.GuruTestBaseSetup;
import come.guru.home.GuruSignInPage;


public class GuruLoginTest extends GuruTestBaseSetup {

	private WebDriver driver;
	private GuruBasePage basePage;
	private GuruSignInPage signInPage;

	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}

	@Test
	public void loginTest() throws Exception{	
		basePage = new GuruBasePage(driver);		
		signInPage=basePage.GoToHomePageAndSignIn("mngr325135", "metYnYt");
		Thread.sleep(3000);
		Assert.assertTrue(signInPage.verifySignInPageTitle(), "Sign In page title doesn't match");
		Assert.assertTrue(signInPage.verifySignInPageText(), "Page text not matching");
		Assert.assertTrue(signInPage.verifySignInPageURL(), "Page URL not matching");
	}
}
