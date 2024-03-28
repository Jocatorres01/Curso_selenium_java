import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class metodos_basicos_selenium {

	public static void main(String[] args) {
		  System.setProperty("webdriver.Chrome.driver", "C:\\Users\\glitt\\OneDrive\\Documentos\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver_chrome = new ChromeDriver();
		  //metodo basico 1, get = nos abre la pagina requerida
		  driver_chrome.get("https://www.google.com");
		  //metodo basico 2, getTitle() = nos trae el titulo de la pagina actual
		  System.out.println(driver_chrome.getTitle());
		  //metodo basico 3, getCurrentUrl() muestra la direccion actual de la pagina
		  System.out.println(driver_chrome.getCurrentUrl());
		  //metodo basico 4, .close() = cierra el navegador
		  driver_chrome.close();
		  //metodo basico 5, .quit() = termina la sesion del driver 
		  driver_chrome.quit();
		  
		  //edge
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\glitt\\OneDrive\\Documentos\\drivers\\edgedriver_win64\\msedgedriver.exe");
		  WebDriver driver_edge = new EdgeDriver();
		  //metodo basico 1, get = nos abre la pagina requerida
		  driver_edge.get("https://www.google.com");
		  //metodo basico 2, getTitle() = nos trae el titulo de la pagina actual
		  System.out.println(driver_edge.getTitle());
		  //metodo basico 3, getCurrentUrl() muestra la direccion actual de la pagina
		  System.out.println(driver_edge.getCurrentUrl());
		  //metodo basico 4, .close() = cierra el navegador
		  driver_edge.close();
		  //metodo basico 5, .quit() = termina la sesion del driver 
		  driver_edge.quit();
		  
		  //firefox
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\glitt\\OneDrive\\Documentos\\drivers\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		  WebDriver driver_firefox = new FirefoxDriver();
		  //metodo basico 1, get = nos abre la pagina requerida
		  driver_firefox.get("https://www.google.com");
		  //metodo basico 2, getTitle() = nos trae el titulo de la pagina actual
		  System.out.println(driver_firefox.getTitle());
		  //metodo basico 3, getCurrentUrl() muestra la direccion actual de la pagina
		  System.out.println(driver_firefox.getCurrentUrl());
		  //metodo basico 4, .close() = cierra el navegador
		  driver_firefox.close();
		  //metodo basico 5, .quit() = termina la sesion del driver 
		  driver_firefox.quit();
	}

}