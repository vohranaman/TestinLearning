package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AT02_NavigateToLoginToMyAccount extends AT01_NavigatetohomepageofHN{
	@Test(priority=2)
	public void NavLoginToMyAcc(){

		
driver.findElement(By.xpath("//*[@id='header']/div[1]/div/ul/li[5]/a")).click();

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);



}

}
