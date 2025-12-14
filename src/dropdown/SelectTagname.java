package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagname  {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.cssSelector("select"));
		Select s =  new Select(dropdown);
		s.selectByVisibleText("Option 1");
		
		
		

	}

}
