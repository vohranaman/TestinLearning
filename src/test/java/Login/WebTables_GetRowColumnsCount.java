package Login;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class WebTables_GetRowColumnsCount {
	WebDriver driver;	
@Test(priority=1)
 public void NavigateHN(){	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vohra\\eclipse-workspace\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//Number of columns
List <WebElement> col= driver.findElements(By.xpath("//*[@id=\'leftcontainer\']/table/thead/tr/th"));
System.out.println("No of Columns " + col.size());
//No of Rows
List <WebElement> row=driver.findElements(By.xpath("//*[@id=\'leftcontainer\']/table/tbody/tr/td[1]"));
System.out.println("No of Rows " + row.size());
}
}

