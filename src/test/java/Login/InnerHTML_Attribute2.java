package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class InnerHTML_Attribute2 {
	WebDriver driver;	
@Test(priority=1)
public void NavigateHN(){	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vohra\\eclipse-workspace\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://harveynorman.com.au");
//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).click();
//If nothing is geting caputured, capture the error message
String InnerHTML=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).getAttribute("href");
System.out.println(InnerHTML);
driver.close();


	}

}
