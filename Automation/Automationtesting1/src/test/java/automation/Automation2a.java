package automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Automation2a {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Shashank\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("http://www.jqueryui.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   Actions mouse=new Actions(driver);
		   mouse.moveToElement(driver.findElement(By.linkText("Download"))).build().perform();
		   Thread.sleep(2000);
		   mouse.doubleClick(driver.findElement(By.linkText("Download"))).perform();
		   driver.close();
		   
		  
}

}