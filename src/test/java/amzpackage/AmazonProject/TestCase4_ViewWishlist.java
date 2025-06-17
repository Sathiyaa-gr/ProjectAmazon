package amzpackage.AmazonProject;

import org.testng.annotations.Test;


public class TestCase4_ViewWishlist extends BaseClass
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
			
			homepage.searchingtheproduct();
			
			AmzWishlistResultPage wishlistpage=new AmzWishlistResultPage(driver);
			wishlistpage.first_product();
			wishlistpage.switchtoNewWindow();
			wishlistpage.clickwishlist();
			
			AmzViewWishlistPage viewlistpage=new AmzViewWishlistPage(driver);
			viewlistpage.clickviewYourList();
			viewlistpage.wish_list_addtocart();
			
			homepage.hoveroveraccountandlist(driver);
			homepage.logout();	
			
			driver.quit();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		/*	
			homepage.hoveroveraccountandlist(driver);
			homepage.logout();
			*/
			
		}

}
