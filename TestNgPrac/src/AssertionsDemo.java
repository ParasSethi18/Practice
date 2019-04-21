import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo{
	 SoftAssert softAssert=new SoftAssert();
		String assertionString="demoforHardAssertion";
		 @Test
		  public void test1() 
		  {
			softAssert.assertEquals("demoforHardAssertions", assertionString);	 
			softAssert.assertAll();  
		  }
			
		 @Test
		  public void test2() 
		  {
			 softAssert.assertEquals("demoforHardAssertion", assertionString);	  
			 softAssert.assertAll(); 
			  
		  }
		 
		 SoftAssert softAssert1=new SoftAssert();
			
		 @Test
		 public void test3() {
			 softAssert1.assertEquals("demoforHardAssertion", assertionString);	  
			 softAssert1.assertAll(); 
		 }
	
	
}
