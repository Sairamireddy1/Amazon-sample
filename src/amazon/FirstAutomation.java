package amazon;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
 

public class FirstAutomation {
	public String url;
//	public WebDriver driver=new ChromeDriver();

public WebDriver driver;
//@BeforeTest
@BeforeTest
	public void test()
			throws InterruptedException
			{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav Reddy\\eclipse-workspace\\Amazon\\Driver\\chromedriver.exe");

			driver=new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
			}
	
	@Test

	public void test1()
			throws InterruptedException 
	{
		
		driver.get("https://amazon.com");
		System.out.println("welcome to U.S Amazon");
//		driver.get("https://www.amazon.in/?ref_=icp_country_from_us");

		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("sketchers");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[1]/span[1]/span[2]")).click();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,10000)");		

		
		driver.findElement(By.xpath("//span[contains(text(),'United States')]")).click();

		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		
		driver.findElement(By.xpath("//a[@id='icp-dropdown_7']")).click();
		
		String originalWindow = driver.getWindowHandle();
		assert driver.getWindowHandles().size() == 1;

		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		
		System.out.println("Switching ot Amazon INDIA");
		
		//Loop through until we find a new window handle
		for (String windowHandle : driver.getWindowHandles()) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		
		{
			url = driver.getCurrentUrl();

		System.out.println(url);
		}
	}
@Test

public void test2()
//		throws InterruptedException
{
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav Reddy\\eclipse-workspace\\Amazon\\Driver\\chromedriver.exe");
	System.out.println("welcome to selenium java");
}

/*
@Test
public void test4()
{
	System.out.println(driver.getTitle());

		System.out.println("second window");

	//driver.get("https://www.amazon.in/?ref_=icp_country_from_us");

	
	driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
	System.out.println(driver.getTitle());
	
	driver.navigate().back();
	System.out.println(driver.getTitle());
	
	driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]")).click();
	System.out.println(driver.getTitle());

	driver.findElement(By.xpath("//div[contains(text(),'American Tourister 32 Ltrs Grey Casual Backpack (A')]")).click();
	System.out.println(driver.getTitle());
	
//	driver.findElement(By.className("//input[@id='add-to-cart-button' and @name='submit.add-to-cart']")).click();
//	System.out.println(driver.getTitle());

//	driver.findElement(By.xpath("//a[contains(text(),'Go to Cart')]")).click();
//	System.out.println(driver.getTitle());
	
//	driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
//	System.out.println(driver.getTitle());
	
	
	
	
//	driver.close();
}	
//@AfterTest
@Test
public void test5()
	{
	
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav Reddy\\eclipse-workspace\\Amazon\\Driver\\chromedriver.exe");

//		WebDriver driver=new ChromeDriver();
		driver.quit();
	}
*/
}


