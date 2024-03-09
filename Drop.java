import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop  {

	
    
/**	public  void check() throws InterruptedException
	{
	    driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		List<WebElement> e=driver.findElements(By.xpath("//form"));
		int lsize=e.size();
		System.out.print(lsize);
		for(int i=lsize-2;i<e.size();i++)
		{
			
			System.out.print(e.get(i).getText());
			Thread.sleep(10000);
		}
		WebDriverWait wb=new WebDriverWait(driver,Duration.ofSeconds(1000));
		wb.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='red']"))).click();
		
     
		driver.close();
		driver.quit();
	}  
 * @throws InterruptedException ***/
	/** @Test
	public void dropdown() throws InterruptedException
	{
		WebDriver driver;
		driver=WebDriverManager.chromedriver().create();
		driver.get("https://semantic-ui.com/modules/dropdown.html#/examples");
		WebElement e1=driver.findElement(By.xpath("//div[@class=\"ui dropdown active visible\"]"));
		e1.click();
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		e1.click();

		Thread.sleep(10000);

		driver.close();
		driver.quit();
	}   **/
	@Test
	public void Strintest()
	{
	String s="welcome";
	String s1=new String("welcome");
	if(s==s1)
	{
		System.out.print("true");
	}
	else
	{
		System.out.print("false ==");
	}
	if(s.equals(s1))
	{
		System.out.print("True equals");
	}
	
	}
}
