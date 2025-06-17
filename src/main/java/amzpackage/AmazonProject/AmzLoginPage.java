package amzpackage.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzLoginPage {
	WebDriver driver;
	//step 1
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continuefromUN;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signin_link;
	//step 2
	public void un()
	{
		username.sendKeys("9940271110");
		
	}
	public void continueUN()
	{
		continuefromUN.click();
		
	}
	public void pwd()
	{
																																																																	password.sendKeys("Jashu@16");
		
	}
	public void  sigin() throws InterruptedException
	{
		Thread.sleep(2000);
		signin_link.click();
		
		
	}
	//step 3
	public AmzLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
