package amzpackage.AmazonProject;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCase1_LoginToAmazonLogout extends BaseClass
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
			Assert.assertEquals(driver.getTitle(), "Your Amazon.in");
			
			homepage.hoveroveraccountandlist(driver);
			homepage.logout();
			
			
		}

}
