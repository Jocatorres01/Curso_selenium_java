import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class localizadores_amigables {

	public static void main(String[] args) {
		//edge
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\glitt\\OneDrive\\Documentos\\drivers\\edgedriver_win64\\msedgedriver.exe");
		  WebDriver driver_edge = new EdgeDriver();
		  //metodo basico 1, get = nos abre la pagina requerida
		  driver_edge.get("https://www.google.com");
		  //localizador relativo - derecha de
		 // driver_edge.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.className("gb_v"))).click();
		 //localizador relativo - concatenacion, derecha de e izquierda de
		  driver_edge.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_d")).toRightOf(By.className("gb_v"))).click();
		  
		//chrome
		  System.setProperty("webdriver.Chrome.driver", "C:\\Users\\glitt\\OneDrive\\Documentos\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver_chrome = new ChromeDriver();
		  //metodo basico 1, get = nos abre la pagina requerida
		  driver_chrome.get("https://www.google.com");
		  //localizador relativo - derecha de
		 // driver_chrome.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.className("gb_v"))).click();
		 //localizador relativo - concatenacion, derecha de e izquierda de
		  driver_chrome.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_d")).toRightOf(By.className("gb_v"))).click();
		   
		//firefox 
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\glitt\\OneDrive\\Documentos\\drivers\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		  WebDriver driver_firefox = new FirefoxDriver();
		  //metodo basico 1, get = nos abre la pagina requerida
		  driver_firefox.get("https://www.google.com");
		  //localizador relativo - derecha de
		 // driver_firefox.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.className("gb_v"))).click();
		 //localizador relativo - concatenacion, derecha de e izquierda de
		  driver_firefox.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_d")).toRightOf(By.className("gb_v"))).click();
		   
	}

}