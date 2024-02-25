package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//Launch web browser
	WebDriver driver = new ChromeDriver();
//load url
	driver.navigate().to("https://www.guvi.in/");
//maximize window
	driver.manage().window().maximize();
//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//inspect sign up	
	driver.findElement(By.xpath("//a[@class=\"nav-link btn btn-primary text-white px-4\"]")).click();
//inspect name	
	driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Divya");
//inspect email	
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("divyaganeshwathi@gmail.com");
//inspect password
	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Dhan@sekar5");
//inspect mobile no	
	driver.findElement(By.xpath("//input[@id=\"mobileNumber\"]")).sendKeys("7200965967");
//inspect signup button	
	driver.findElement(By.xpath("//a[@id=\"signup-btn\"]")).click();
	
	
	}

}
