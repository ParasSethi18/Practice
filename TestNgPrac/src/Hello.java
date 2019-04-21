import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hello {
  @BeforeSuite
  public void beforesuite() {
	  System.out.println("Before Suite");
  }
  @Parameters({"browser","url"})
  @BeforeClass
  public void beforeclass(@Optional("IE")String browser,String url) {
	  System.out.println("Before Class");
	  System.out.println(browser+" "+url);
	  
  }
	
  @BeforeTest
  public void beforetest() {
	  System.out.println("Before Test");
  }
  @BeforeMethod
  public void beforemethod() {
	  System.out.println("Before method");
  }

	
 SoftAssert softAssert=new SoftAssert();
String assertionString="demoforHardAssertion";
SoftAssert softAssert1=new SoftAssert();
String assertionString1="demoforHardAssertion";
 @Test(groups = {"car"})
  public void test1() 
  {
	softAssert.assertEquals("demoforHardAssertions", assertionString);	 
	softAssert.assertAll();  
  }
 
	
 @Test(groups = {"ecar"})
  public void test2()
  {
	 softAssert1.assertEquals("demoforHardAssertion", assertionString);	  
	 softAssert1.assertAll(); 
  }  
  
}	  
	

