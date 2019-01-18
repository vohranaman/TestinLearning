package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AT03_NavigateToCreateAnAccount extends AT02_NavigateToLoginToMyAccount{
	@Test(priority=3)
	public void NavCreAcc() {

driver.findElement(By.xpath("//*[@id=\"new-account-info\"]/div/a/span")).click();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.id("firstname")).sendKeys("Naman");
driver.findElement(By.id("lastname")).sendKeys("Vohra");
driver.findElement(By.id("email_address")).sendKeys("Vohranaman@gmail.com");
driver.findElement(By.id("password")).sendKeys("Ab1234567890$");
driver.findElement(By.id("confirmation")).sendKeys("Ab1234567890$");
driver.findElement(By.id("accept_terms")).click();
driver.findElement(By.xpath("//*[@id=\"form-createaccount\"]/div[4]/div/button")).click();

	}
}
//DOUBT- REPORTS DOESNT GET GENERATED ON SUITES