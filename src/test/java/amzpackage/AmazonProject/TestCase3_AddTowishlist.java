package amzpackage.AmazonProject;

import org.testng.annotations.Test;

public class TestCase3_AddTowishlist extends BaseClass
{
	String parentWindow;
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
			
			homepage.searchingtheproduct();
			
			AmzWishlistResultPage wishlistpage=new AmzWishlistResultPage(driver);
			wishlistpage.first_product();
			wishlistpage.switchtoNewWindow();

			wishlistpage.clickwishlist();
			System.out.println(wishlistpage.getNewTabTitle());
			driver.close();
			wishlistpage.switchBackToParent();
			
			
			homepage.hoveroveraccountandlist(driver);
			homepage.logout();		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		/*	
			homepage.hoveroveraccountandlist(driver);
			homepage.logout();
			*/
			
		}

}
