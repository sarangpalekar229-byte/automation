import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle extends BaseClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		String mainWindow = driver.getWindowHandle();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows = driver.getWindowHandles();
		for(String win : windows) {
			if(!win.equals(windows)) {
				driver.switchTo().window(win);
				System.out.println("New Window Title : "+ driver.getTitle());
				driver.close();
				
			}
		}
		driver.switchTo().window(mainWindow);
		System.out.println("Back to Main Window : "+ driver.getTitle());
		driver.quit();
			
		}
		

	}


