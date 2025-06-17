package amzpackage.AmazonProject;

import org.testng.annotations.Test;


public class TestCase5_AddAddress extends BaseClass
{
	
		@Test
		public void withvalidvredentails() throws InterruptedException
		{
			
			AmzHomePage homepage=new AmzHomePage(driver);
			homepage.hoveroveraccountandlist(driver);
			homepage.signin();
			
			
			AmzLoginPage loginpage=new AmzLoginPage(driver);
			loginpage.un();
			loginpage.continueUN();
			loginpage.pwd();
			loginpage.sigin();
			
			
			homepage.hoveroveraccountandlist(driver);
			
			
			AmzAddressPage addressPage=new AmzAddressPage(driver);
			addressPage.yourAccount();
			addressPage.Address();
			addressPage.Add_Address();
			addressPage.full_Name();
			addressPage.phone_no();
			addressPage.flat_no();
			addressPage.Area();
			addressPage.pincode();
			addressPage.city();
			addressPage.state();
			addressPage.addAddr_btn();
			
			

			homepage.hoveroveraccountandlist(driver);
			homepage.logout();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		/*	
			homepage.hoveroveraccountandlist(driver);
			homepage.logout();
			*/
			
		}

}
