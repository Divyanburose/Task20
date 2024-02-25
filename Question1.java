package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Launch browser
	WebDriver driver = new ChromeDriver();
//Load url
	driver.get("https://jqueryui.com/datepicker/");
//Maximize window
	driver.manage().window().maximize();
//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//switching the frame
	driver.switchTo().frame(0);
//Inspect date
    driver.findElement(By.xpath("//input[@class=\"hasDatepicker\"]")).click();
	driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
    driver.findElement(By.xpath("//a[text()=\"22\"]")).click();
    String actualtext = driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]")).getText();
	System.out.println("Actual date:"+actualtext);
	
   //close the current window 
    //driver.close();
	
   //close the entire windows
    //driver.quit();
	}

}
