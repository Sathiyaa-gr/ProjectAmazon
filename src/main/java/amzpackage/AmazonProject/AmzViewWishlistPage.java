package amzpackage.AmazonProject;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzViewWishlistPage {
	
	
	//step 1
	@FindBy(xpath="//a[normalize-space()='View Your List']")
	WebElement viewYourList_bt;
	
	@FindBy(xpath="//span[@id='pab-I3CMBR81BHR1TD']")
	WebElement addtocart_button;
	
	//step 2
	
	public void clickviewYourList() 
	{
		
		viewYourList_bt.click();
	}
	public void wish_list_addtocart() 
	{
		
		addtocart_button.click();
	}
	
	//step 3
	public AmzViewWishlistPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
}
