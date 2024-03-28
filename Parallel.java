import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel {
	/***
	 * @Test public void Open() { WebDriver driver; driver =
	 *       WebDriverManager.chromedriver().create();
	 *       driver.get("https://www.amazon.in"); WebElement e1 =
	 *       driver.findElement(By.xpath("//iframe")); try {
	 *       driver.switchTo().frame(e1);
	 * 
	 *       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000)); }
	 *       catch(Exception e) { e.printStackTrace(); } driver.close();
	 *       driver.quit();
	 * 
	 *       }
	 **/
	@Test
	public void drop() {
		WebDriver driver;
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://semantic-ui.com/modules/dropdown.html#/definition");
		WebElement e1 = driver.findElement(By.xpath("*//select)]"));
		Select s=new Select(e1);
		List l=s.getOptions();
		for(int i=0;i<l.size();i++)
		{
			Object s1=l.get(i);
			System.out.print(s1);

		}
                 System.out.print("erl");
		driver.close();
		driver.quit();
		}


	

	/**
	 * @Test public void close() { WebDriver driver; driver =
	 *       WebDriverManager.chromedriver().create();
	 *       driver.get("https://demoqa.com/nestedframes"); WebElement
	 *       e2=driver.findElement(By.tagName("iframe"));
	 *       driver.switchTo().frame(e2);
	 * 
	 *       driver.close(); driver.quit(); }
	 **/
}
