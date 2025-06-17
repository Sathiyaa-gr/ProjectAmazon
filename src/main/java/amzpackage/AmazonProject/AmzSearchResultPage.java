package amzpackage.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzSearchResultPage {
	WebDriver driver;
	//step 1
	@FindBy(xpath="(//button[.='Add to cart'])[1]")
	WebElement addtocart;
	
	@FindBy(xpath="//div[@class='a-row a-size-medium']//button")
	WebElement click_addtocart;
	//div[@class='a-row a-size-medium']//button
	
	
	//step 2
	public void addingfirstproducttocart() throws InterruptedException
	{
		
		addtocart.click();
		
	}

	public void clickaddtocart() throws InterruptedException
	{
		
		click_addtocart.click();
		
	}
	//step 3
	public AmzSearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public String getSearchKeyword() {
		// TODO Auto-generated method stub
		return null;
	}
}
