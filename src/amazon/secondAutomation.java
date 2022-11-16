package amazon;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class secondAutomation extends FirstAutomation {

private static final int timeout = 0;
//	WebDriver driver=new ChromeDriver();
/*
	@Test
//	public static void main(String[] args) 
	
	public void test7()
			throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav Reddy\\eclipse-workspace\\Amazon\\Driver\\chromedriver.exe");
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
		System.out.println("SecondAutoation");
		driver.get(url);
	}
	
	@Test
	public void test8()
	{
		
			
			System.out.println("second window");

		//driver.get("https://www.amazon.in/?ref_=icp_country_from_us");

		
		driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[4]/div[1]/span[2]")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-main']/div[1]/a[1]/span[1]")).click();

		driver.findElement(By.xpath("//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[1]/li[2]/a[1]")).click();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,10000)");		

		
		driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='zg']/div[@id='zg_colmask']/div[@id='zg_colleft']/div[@id='zg_col1wrap']/div[@id='zg_col1']/div[@id='zg_left_colmask']/div[@id='zg_left_colleft']/div[@id='zg_left_col1wrap']/div[@id='zg_left_col1']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/a[1]/span[1]/i[1]")).click();

		driver.findElement(By.xpath("//div[contains(text(),'Trajectory Supercomfy Grey Neck Pillow Rest Cushio')]")).click();
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Go to Cart')]")).click();
	
		System.out.println(driver.getTitle());
		
		driver.close();
	}	
}
*/
	@Test
	public void test3()
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

	//	driver.findElement(By.xpath("//div[contains(text(),'American Tourister 32 Ltrs Grey Casual Backpack (A')]")).click();
	//	System.out.println(driver.getTitle());
		
	/*	driver.findElement(By.className("//input[@id='add-to-cart-button' and @name='submit.add-to-cart']")).click();
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//a[contains(text(),'Go to Cart')]")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		System.out.println(driver.getTitle());
	*/	
		
		
		
//		driver.close();
	}	
	//@AfterTest
	@AfterTest
	public void testclose() throws InterruptedException
		{
		Thread.sleep(50);
			driver.navigate().back();
			driver.navigate().back();
			Thread.sleep(50);
//			driver.navigate().back();
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav Reddy\\eclipse-workspace\\Amazon\\Driver\\chromedriver.exe");
			Thread.sleep(5000);
			driver.quit();
		}
}