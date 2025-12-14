import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlerts extends BaseClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text = "+alert.getText());
		alert.accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert confirm = driver.switchTo().alert();
		confirm.dismiss();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert Prompt = driver.switchTo().alert();
		Prompt.sendKeys("Hello Selenium");
		Prompt.accept();
		driver.quit();
	}	
		
}


