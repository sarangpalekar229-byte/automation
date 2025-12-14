import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {


	public static void main(String[] args) {
		
		String Browser = "edge";
		WebDriver driver;
		if(Browser.equalsIgnoreCase("Chrome")){
			
			driver = new ChromeDriver();
			System.out.println("Chrome Browser Launched");
		}else if(Browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			System.out.println("Firefox Browser Lauched");
		}else if(Browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			System.out.println("Edge Browser Launched");
		} else {
			System.out.println("Invalid Browser Name!");
			return;
			
		}
		driver.get("http:\\www.google.com");
		driver.quit();
			
		}
	}
	


