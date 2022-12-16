package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("mad");
		driver.findElement(By.name("lastname")).sendKeys("king");
		driver.findElement(By.name("reg_email__")).sendKeys("madking666@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("123madking");
		driver.findElement(By.id("day")).sendKeys("02");
		driver.findElement(By.id("month")).sendKeys("Jun");
		driver.findElement(By.id("year")).sendKeys("1997");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		//driver.close();
	}

}
