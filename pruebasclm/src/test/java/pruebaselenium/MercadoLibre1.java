package pruebaselenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercadoLibre1 {

	private WebDriver driver; 
	
	@Before
		public void SetUp() {
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver/chromedriver.exe");
	driver = new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.get("https://www.mercadolibre.cl/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/*	
	@Test
		public void mercadolibretest() {
		WebElement ingreso1 = driver.findElement(By.linkText("Ingresa"));
			ingreso1.click();
		WebElement user = driver.findElement(By.id("user_id"));
			user.sendKeys("suainduran1@gmail.com");
		WebElement ingreso2 = driver.findElement(By.className("andes-button__content"));
			ingreso2.click();
		WebElement pasword = driver.findElement(By.id("password"));
			pasword.sendKeys("0%&mjab7512910");
		
		try {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
	@Test
		public void categoriaml() {
		WebElement categoria = driver.findElement(By.className("nav-menu-categories-link"));
			categoria.click();
		WebElement computacion = driver.findElement(By.partialLinkText("Computación"));
			computacion.click();
		WebElement tableta = driver.findElement(By.partialLinkText("Tabletas Digitalizadoras"));
			tableta.click();
		WebElement verdescripcion = driver.findElement(By.className("ui-search-item__title"));
			verdescripcion.click();
		WebElement comprar = driver.findElement(By.id("BidButtonTop"));
			comprar.click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		try {
			
		}catch(Exception e) {
			e.printStackTrace();				
		}
		
	}
		
		@After
				
		public void tearDown() {
			driver.quit();
		}



}
