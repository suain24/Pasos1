package pruebaselenium;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercadoLibre2 {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercadolibre.cl/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void AlcoholGel() {
		assertTrue(busqueda("Alcohol Gel"));		
		WebElement articulo = driver.findElement(By.xpath("//span[@class='nav-skip-to-main-content__content']"));
		articulo.click();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	public boolean busqueda(String busqueda) {
		try {
			WebElement cajabusqueda = driver.findElement(By.name("as_word"));
			cajabusqueda.sendKeys(busqueda);
			WebElement boton = driver.findElement(By.className("nav-search-btn"));
			boton.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	
}
