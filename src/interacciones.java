import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class interacciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\glitt\\OneDrive\\Documentos\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver_edge = new EdgeDriver();
		driver_edge.get("https://www.amazon.com");
		//send keys
		driver_edge.findElement(By.id("twotabsearchtexbox")).sendKeys("nintendo switch");
		//driver_edge.findElement(By.id("nav-search-submit-button")).click();
		//clear
		driver_edge.findElement(By.id("twotabsearchtexbox")).clear();
		//click()
		driver_edge.findElement(By.id("nav-hamburger-menu")).click();
		//submit()ya no es valido
	}

}
