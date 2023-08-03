import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./Utils/chromedriver"); //Set driver's location
		WebDriver driver = new ChromeDriver(); //Initialize driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost:8001/");
	   
	    driver.findElement(By.id(":r1:-tab-1")).click();
	    driver.findElement(By.id("add-director-btn")).click();
	    
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).sendKeys("Sofia Coppola");
	    driver.findElement(By.cssSelector(".h-min > .flex")).click();
	    
	    driver.findElement(By.id("add-director-btn")).click();
	    
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).sendKeys("Tim Burton");    
	    driver.findElement(By.cssSelector(".h-min > .flex")).click();
	    
	    driver.findElement(By.id(":r1:-tab-0")).click();
	    
	    driver.findElement(By.id("add-movie-btn")).click();
	    driver.findElement(By.id("title")).click();
	    driver.findElement(By.id("title")).sendKeys("Maria Antonieta");
	    driver.findElement(By.id("description")).click();
	    driver.findElement(By.id("description")).sendKeys("Ascenso y  fin de la reina Maria Antonieta");
	    driver.findElement(By.id("year")).click();
	    driver.findElement(By.id("year")).sendKeys("2006");
	    driver.findElement(By.id("director_id")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("director_id"));
	      dropdown.findElement(By.xpath("//option[. = 'Sofia Coppola']")).click();
	    }
	    driver.findElement(By.cssSelector(".h-min > .flex")).click();
	    
	    driver.findElement(By.id("add-movie-btn")).click();
	    driver.findElement(By.id("title")).click();
	    driver.findElement(By.id("title")).sendKeys("Sweeney Todd");
	    driver.findElement(By.id("description")).click();
	    driver.findElement(By.id("description")).sendKeys("Narra el lado oscuro de Benjamin Barker");
	    driver.findElement(By.id("year")).click();
	    driver.findElement(By.id("year")).sendKeys("2007");
	    driver.findElement(By.id("director_id")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("director_id"));
	      dropdown.findElement(By.xpath("//option[. = 'Tim Burton']")).click();
	    }
	    driver.findElement(By.cssSelector(".h-min > .flex")).click();
	    
	    driver.findElement(By.id("add-movie-btn")).click();
	    driver.findElement(By.id("title")).click();
	    driver.findElement(By.id("title")).sendKeys("Interstellar");
	    driver.findElement(By.id("description")).click();
	    driver.findElement(By.id("description")).sendKeys("Viaje en tiempo y espacio");
	    driver.findElement(By.id("year")).click();
	    driver.findElement(By.id("year")).sendKeys("2010");
	    driver.findElement(By.id("director_id")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("director_id"));
	      dropdown.findElement(By.xpath("//option[. = 'Cristopher Nolan']")).click();
	    }
	    driver.findElement(By.cssSelector(".h-min > .flex")).click();
	    
	    driver.findElement(By.id("add-movie-btn")).click();
	    driver.findElement(By.id("title")).click();
	    driver.findElement(By.id("title")).sendKeys("Inception");
	    driver.findElement(By.id("description")).click();
	    driver.findElement(By.id("description")).sendKeys("Espionaje y manipulacion de sueños");
	    driver.findElement(By.id("year")).click();
	    driver.findElement(By.id("year")).sendKeys("2010");
	    driver.findElement(By.id("director_id")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("director_id"));
	      dropdown.findElement(By.xpath("//option[. = 'Cristopher Nolan']")).click();
	    }
	    driver.findElement(By.cssSelector(".h-min > .flex")).click();
	    
	    //driver.quit();
	}

}
