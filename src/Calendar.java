

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar extends BaseClass {

	public static void main(String[] args)  {
		System.setProperty("Webdriver.chrome.driver", "C://path//to/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(driver.findElement(By.className(("demo-frame"))));
		WebElement dateInput = driver.findElement(By.id("datepicker"));
		dateInput.click();
		WebElement Date = driver.findElement(By.xpath("//a[text()='18']"));
		Date.click();
		System.out.println("Selected Date : "+ dateInput.getAttribute("value"));
		driver.switchTo().defaultContent();
		driver.quit();	
		
	}
}