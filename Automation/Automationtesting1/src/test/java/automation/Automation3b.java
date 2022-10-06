package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation3b {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Shashank\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		
		  driver.get("https://demo.automationtesting.in/Alerts.html");
		 
		  driver.findElement(By.linkText("Alert with Textbox")).click();
		  driver.findElement(By.cssSelector("button.btn.btn-info")).click();
		  driver.switchTo().alert().sendKeys("shashank");
		  Alert Alertbox=driver.switchTo().alert();
	  Thread.sleep(2000);
		  Alertbox.accept();
		  
	}

}