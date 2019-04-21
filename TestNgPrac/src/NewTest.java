import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	WebDriver driver;
    @BeforeSuite
  @Parameters({"browser","url"})
  
  public void Suit(@Optional("Firefox")String browser,String url) {
	  
	  System.out.println("Browser"+browser+"url"+url);
	  switch (browser){
	  case "Chrome":
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\paras-pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get(url);
		  
		  break;
	  case "Firefox":
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\paras-pc\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		  driver= new FirefoxDriver();
		  driver.get(url);
		  break;
	 
	  }
	  driver.manage().window().maximize(); 	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }
  @Test(dependsOnMethods = {"third"})
  public void first() {
	  System.out.println("First One to execute");
  }
  @Test
  public void third() {System.out.println("third");}

  @Test 
  public void second() {System.out.println("Second");}
  @Test(dataProvider = "dp")
  public void f(String firstname,String lastname) {
	  System.out.println(firstname+" "+lastname);
	  driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"sum1\"]")).sendKeys(firstname);
	  driver.findElement(By.xpath("//*[@id=\"sum2\"]")).sendKeys(lastname);
	  
  }


  @DataProvider
  public Object[][] dp() {
   Object [][] data =new Object[2][2];
   data [0][0] = "paras";
   data[0][1] = "sethi";
   data[1][0] = "paras1";
   data[1][1] = "sethi1";
    return data;
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }


  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
