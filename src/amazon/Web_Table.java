package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav Reddy\\eclipse-workspace\\Amazon\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.selenium.dev/downloads/");
		
		int rows = driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr")).size();
		System.out.println("Total number of rows in a table: "+rows);
		
		int cols = driver.findElements(By.xpath("//tavle[@class='data-list']//thread/tr/th")).size();
		System.out.println("Total number of cols in a table: "+cols);
		
	}

}
