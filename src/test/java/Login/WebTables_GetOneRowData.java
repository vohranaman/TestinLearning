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


public class WebTables_GetOneRowData {
	
	@Test
	public void NavigateHN(){
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vohra\\eclipse-workspace\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  //driver.manage().window().maximize();
	  driver.get("file:///C:/Users/vohra/Desktop/Selenium/table.html");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //Row1, column2 cell value print
	  WebElement cellValue=driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody/tr[1]/td[2]"));
	  System.out.println("printing specific cell vale: " + cellValue.getText());
	  
	  //To print all the values in the row which has header as "clock tower hotel"
	  String sRowValue="Clock Tower Hotel";
	  
	  //heading count in first column
	  List <WebElement> ele = driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr/th"));
	  int NumCells=ele.size();
	  System.out.println(NumCells);
	  //get count for row 2
	  List <WebElement> row2Counts = driver.findElements(By.xpath("/html/body/table/tbody/tr[2]/td"));
	  int row2Count=row2Counts.size();
	  
	  for(int i=1;i<=NumCells;i++)
	  {
		//Print headers in column one until it matches with "Clock Tower Hotel" 
	   String sVal=driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody/tr["+i+"]/th")).getText();
	   System.out.println("this is "+sVal);
	   if(sVal.equalsIgnoreCase(sRowValue))
	     {
	    for(int j = 1;j<=row2Count;j++)
	    {
	     WebElement textValue=driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody/tr["+i+"]/td["+j+"]"));
	    System.out.println("text contained row values : " + textValue.getText());
	    }
	    break;
	   }
	  }
	  driver.quit();
	  
	  


	 }
	 }