import org.testng.annotations.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

public class SSL_Certificate {
	WebDriver driver;
	@BeforeSuite
  public void beforesuit() {
	  ProfilesIni profile = new ProfilesIni();
	  FirefoxProfile ffp = profile.getProfile("Selenium1");
	  ffp.setAcceptUntrustedCertificates(true);
	  ffp.setAssumeUntrustedCertificateIssuer(false);
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\paras-pc\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://cacert.org/");
 }
 
  @Test
  public void openApplication() {
		
//		String pageTitle = driver.getTitle();
//		String expectedTitle = "Welcome to CAcert.org";
//		Assert.assertEquals(pageTitle, expectedTitle);
	} 
 

}
