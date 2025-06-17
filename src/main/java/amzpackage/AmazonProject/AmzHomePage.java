package amzpackage.AmazonProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzHomePage 
{
	WebDriver driver;
	//step 1
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signin_link;
	
	
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement signout;
	
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	//step 2
	public void hoveroveraccountandlist(WebDriver driver) throws InterruptedException
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 30);");
		js.executeScript("arguments[0].scrollIntoView(true);", accountandlist);
        Thread.sleep(2000); // short wait to let scroll finish

        js.executeScript("arguments[0].click();", accountandlist);
		
	}

	public void searchingtheproduct()
	{
		search.sendKeys("Decor"+Keys.ENTER);
		
	}
	
	public void signin() throws InterruptedException
	{
		Thread.sleep(2000);
		signin_link.click();
		
	}
	public void logout()
	{
		signout.click();
		
	}
	//step 3
	public AmzHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
