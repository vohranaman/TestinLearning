package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dummy {
	@Test
	public void NavigateHN(){	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vohra\\eclipse-workspace\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://harveynorman.com.au");
		}
}
