import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class navegacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\glitt\\OneDrive\\Documentos\\drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver_edge = new EdgeDriver();
		driver_edge.get("https://www.amazon.com");
		//ir a 
		driver_edge.navigate().to("https://www.youtube.com/channel/UCXovCWzon_5JLL0sIU8d3WQ");
		//regra a
		driver_edge.navigate().back();
		// adelante a
		driver_edge.navigate().forward();
		//actualizar
		driver_edge.navigate().refresh();
	}

}
