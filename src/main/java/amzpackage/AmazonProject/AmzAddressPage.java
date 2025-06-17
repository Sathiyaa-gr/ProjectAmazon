package amzpackage.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzAddressPage {
	WebDriver driver;
	//step 1
	@FindBy(xpath="//span[normalize-space()='Your Account']")
	WebElement yourAccount;
	
	@FindBy(xpath="//h2[normalize-space()='Your Addresses']")
	WebElement your_Address;
	
	@FindBy(xpath="//div[@id='ya-myab-plus-address-icon']")
	WebElement add_Address;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
	WebElement full_Name;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
	WebElement phone;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine1']")
	WebElement flat_no;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine2']")
	WebElement Area;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']")
	WebElement pincode;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressCity']")
	WebElement city;
	
	@FindBy(xpath="//select[@name='address-ui-widgets-enterAddressStateOrRegion']")
	WebElement state;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[3]")
	WebElement addAddr_btn;
	
	public void yourAccount()
	{
		yourAccount.click();																																																													
	}
	public void Address()
	{
		your_Address.click();																																																													
	}
	public void Add_Address()
	{
		add_Address.click();																																																													
	}
	public void full_Name()
	{
		full_Name.sendKeys("Sathiyaa");																																																													
	}
	public void phone_no()
	{
		phone.sendKeys("9940271110");																																																													
	}
	public void flat_no()
	{
		flat_no.sendKeys("No:99, Nehru St");																																																														
	}
	public void Area()
	{
		Area.sendKeys("Kelambakkam, chennai");																																																														
	}
	public void pincode()
	{
		pincode.sendKeys("603103");																																																														
	}
	public void city()
	{
		city.sendKeys("Chennai");																																																													
	}
	public void state()
	{
		state.sendKeys("TamilNadu");																																																													
	}
	public void addAddr_btn()
	{
		addAddr_btn.click();																																																													
	}
	//step 3
	public AmzAddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
