import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider extends BaseClass {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider");
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//div[@id ='slider']/span"));
		Actions a = new Actions(driver);
		a.clickAndHold(slider).moveByOffset(100, 0).release().perform();
		System.out.println("Slider Moved Successfully");

		
		

	}

}
