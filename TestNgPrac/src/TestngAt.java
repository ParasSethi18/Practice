import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngAt {
	
	WebDriver driver;
@BeforeSuite
@Parameters({"browser","url"})
	public void setup(@Optional("Firefox")String browser,String url) {
	
		switch(browser) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\paras-pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\paras-pc\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

@Test
  public void view() {
	String actual = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[9]/a")).getText();
	String expected = "Login";
	
	}

@Test(dependsOnMethods= {"view"})
	public void hover() {	
		Actions act = new Actions(driver);
		WebElement hvr = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[8]/a/span"));
		act.moveToElement(hvr).build().perform();
		driver.findElement(By.linkText("Money2India")).click();
	}
@Test(dependsOnMethods= {"hover"},enabled = false)
	public void teardown() {
		driver.quit();
	}
@AfterSuite
public void g() {}
}
