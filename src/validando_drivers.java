import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validando_drivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// validando chrome driver
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\glitt\\OneDrive\\Documentos\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver_chrome = new ChromeDriver();
		  driver_chrome.get("https://www.google.com");
		  
		//validando geckodrive
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\glitt\\OneDrive\\Documentos\\drivers\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		  WebDriver driver_firefox = new FirefoxDriver();
		  driver_firefox.get("https://www.google.com");
		  
		//validando edgedriver
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\glitt\\OneDrive\\Documentos\\drivers\\edgedriver_win64\\msedgedriver.exe");
		  WebDriver driver_edge = new EdgeDriver();
		  driver_edge.get("https://www.google.com");
		  
	}
	
}