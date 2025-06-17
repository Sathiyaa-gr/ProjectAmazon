package amzpackage.AmazonProject;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzWishlistResultPage {
	WebDriver driver;
	String parentWindowId;
	//step 1
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement firstProduct;
	
	@FindBy(xpath="//input[@id='add-to-wishlist-button-submit']")
	WebElement wishlist_bt;
	
	//step 2
	
	public void first_product() 
	{
		parentWindowId = driver.getWindowHandle();
		firstProduct.click();
	}
	public void clickwishlist() throws InterruptedException 
	{
		
		Thread.sleep(2000);
		wishlist_bt.click();
	}
	
	//step 3
	public AmzWishlistResultPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void switchtoNewWindow()
	{
	 String parentId = driver.getWindowHandle(); // Before clicking
	 Set<String> win = driver.getWindowHandles();
	 for (String id : win) {
	     if (!id.equals(parentId)) {
	    	 String title =driver.switchTo().window(id).getTitle(); // Now in child
	          
	         System.out.println(title);
	         break;
	     }
	 
	  }
	
	}
  public String getNewTabTitle() 
  {
        return driver.getTitle(); 
    }
  
  public void switchBackToParent()
  {
	  if (parentWindowId != null) 
	  {
            driver.switchTo().window(parentWindowId);
        } 
	  else 
	  {
            throw new RuntimeException("Parent window ID is null. Make sure to call clickFirstProduct() first.");
        }
    }
}
