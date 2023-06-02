package Practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test3
{ 
	public WebDriver driver;
	@Test
	public void List3() 
	{
		String Browser = System.getProperty("browser");
		String url = System.getProperty("url");
		if(Browser.equalsIgnoreCase("chrome")) 
		{
			driver=new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
			
		}
		driver.get(url);
		
	}
	
}
