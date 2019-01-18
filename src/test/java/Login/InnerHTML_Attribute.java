package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class InnerHTML_Attribute {
	WebDriver driver;	
@Test(priority=1)
public void NavigateHN(){	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vohra\\eclipse-workspace\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://gmail.com");
driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
//If nothing is geting caputured, capture the error message
String InnerHTML=driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[2]/div[2]/div")).getText();
System.out.println(InnerHTML);
//driver.close();



	}

}
