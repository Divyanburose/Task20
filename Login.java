package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Launch url
		WebDriver driver = new ChromeDriver();
//load url
		driver.navigate().to("https://www.guvi.in/");
//maximize window
		driver.manage().window().maximize();
//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//inspect login		
		driver.findElement(By.xpath("//a[@class=\"nav-link  text-primary text-center px-4\"]")).click();
//inspect email		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("divyanburose@gmail.com");
//inspect password		
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Divy@nbu2605");
//inspect login button		
		driver.findElement(By.xpath("//a[@id=\"login-btn\"]")).click();
	
	}

}
