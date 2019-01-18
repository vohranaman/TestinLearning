package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class AT01_NavigatetohomepageofHN {
	WebDriver driver;	
@Test(priority=1)
 public void NavigateHN(){	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vohra\\eclipse-workspace\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://harveynorman.com.au");

String Title="Harvey Norman | Shop Online for Computers, Electrical, Furniture, Bedding, Bathrooms & Flooring | Harvey Norman Australia";
String DriverTitle=driver.getTitle();
//Comparing expected and Actual Title
//Assert.assertEquals(DriverTitle, Title, "Titles are not matching");
//Comparing WebTitle stored in a string

//Assert True is Boolean Operation to check if it contains values
Assert.assertTrue(DriverTitle.contains("Electrical"));
System.out.println(DriverTitle);
	}

}
//Doubt Calendar Webtables Reports suites


