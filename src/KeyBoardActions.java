import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class KeyBoardActions extends BaseClass {

	public static void main(String[] args)    {
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium keyboard Actions");
		search.sendKeys(Keys.ENTER);
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		action.sendKeys(Keys.ENTER).perform();
		driver.quit();
		
		
	

	}

}
