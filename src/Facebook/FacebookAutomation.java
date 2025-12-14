package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\saran\\Downloads\\chromedriver-win32");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com//");
		 WebElement email = driver.findElement(By.id("email"));
		 email.sendKeys("Sarang@1234");
		 WebElement password = driver.findElement(By.name("pass"));
		 password.sendKeys("Sarang1234");
		 WebElement login = driver.findElement(By.cssSelector("button[name='login']"));
		 login.click();
		 Thread.sleep(3000);
		 driver.quit();	 
		
		
	}

}
