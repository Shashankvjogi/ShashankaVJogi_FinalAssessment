package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation1b {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Shashank\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");//webElement using name
		driver.findElement(By.name("password")).sendKeys("admin123");//webElement using name
		driver.findElement(By.xpath("//button")).click();//webElement using xpath
		driver.findElement(By.xpath("//li//a")).click();//webElement using xpath
		String s=driver.findElement(By.xpath("//li//a")).getText();
		System.out.println(s);
		driver.findElement(By.xpath("//li[3]//a")).click();
		String s1=driver.findElement(By.xpath("//li[3]//a")).getText();//webElement using xpath
		System.out.println(s1);
		driver.findElement(By.xpath("//li[4]//a")).click();
		String s2=driver.findElement(By.xpath("//li[4]//a")).getText();
		System.out.println(s2);
		driver.findElement(By.xpath("//li[5]//a")).click();
		String s3=driver.findElement(By.xpath("//li[5]//a")).getText();
		System.out.println(s3);
	}
}
