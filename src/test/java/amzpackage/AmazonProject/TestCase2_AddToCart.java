package amzpackage.AmazonProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2_AddToCart extends BaseClass
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
			
			
			
			AmzSearchResultPage searchresultpage=new AmzSearchResultPage(driver);
			//String keyword = searchresultpage.getSearchKeyword();
		   // Assert.assertTrue(keyword.toLowerCase().contains("shoe"), "Search result does not contain 'shoe'");
		   
			
			searchresultpage.addingfirstproducttocart();
			//searchresultpage.clickaddtocart();
			
			
			homepage.hoveroveraccountandlist(driver);
			homepage.logout();		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		/*	
			homepage.hoveroveraccountandlist(driver);
			homepage.logout();
			*/
			
		}

}
