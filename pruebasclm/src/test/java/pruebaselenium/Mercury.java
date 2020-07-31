package pruebaselenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury {

private WebDriver driver;
	
	@Before
	public void SepUt(){
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
			}
	
	@Test
	public void mercury() {
		WebElement User = driver.findElement(By.name("userName"));
		User.sendKeys("1234");
		WebElement Pasw = driver.findElement(By.name("password"));
		Pasw.sendKeys("1234");
		WebElement Sing = driver.findElement(By.name("login"));
		Sing.click();
							
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
