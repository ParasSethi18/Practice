import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class XpathAxes {
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\paras-pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("///C:/Users/paras-pc/Desktop/New%20Text%20Document%20(3).html");
	
	
	}
	@Test
  public void f() {
			click("Selenium Webdriver");
  }
	
	public void click(String book) {
		 driver.findElement(By.xpath("//td[contains(text(),'"+book+"')]/preceding-sibling::td/a")).click();
	}
}
