package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice_Webjet {
WebDriver driver;
@Test
public void Webjet() {
	
//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vohra\\\\eclipse-workspace\\\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.webjet.com.au/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id=\"ft-dates-return\"]")).click();
//driver.findElement(By.id("departure-airport")).sendKeys("melbourne");
driver.findElement(By.xpath("//*[@id=\"ft-div-check-in\"]/div/div[1]/table/tbody/tr[3]/td[7]/a")).click();
driver.findElement(By.xpath("//*[@id=\"ft-div-check-out\"]/div/div[2]/table/tbody/tr[3]/td[4]/a")).click();
//driver.close();
}
}
