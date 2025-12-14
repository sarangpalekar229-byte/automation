import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions extends BaseClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\google.com");
		WebElement menu = driver.findElement(By.id("APjFqb"));
		menu.click();
		menu.sendKeys("Java");
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();
		
		

	}

}
