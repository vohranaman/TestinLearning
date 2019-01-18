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


public class WebTables_GetAllRowsData {
	WebDriver driver;	
@Test(priority=1, description="It is displaying Column text.")
 public void NavigateHN(){	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vohra\\eclipse-workspace\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/vohra/Desktop/Selenium/table.html");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//Number of columns
List <WebElement> col= driver.findElements(By.xpath("/html/body/table/tbody/tr"));
System.out.println(col.size());
//List <WebElement> row= driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/td"));
//for(int i=0;i<col.size();i++) {
//	System.out.println(col.get(i).getText());

//Another way of doing it
for(WebElement a: col) {
	System.out.println(a.getText());
}


//Another way of doing that
//for(int i=0;i<col.size();i++) {
//	for(int j=0;j<row.size();j++) {
//		String abc=col.get(j).getText();
//		System.out.println(abc);
//	}
//}
driver.close();
}
}

