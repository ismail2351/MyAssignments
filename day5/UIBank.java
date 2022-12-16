package week3.day5;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIBank {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("mohamed");
		driver.findElement(By.id("title")).sendKeys("Mr");
		driver.findElement(By.id("middleName")).sendKeys("ismail");
		driver.findElement(By.id("lastName")).sendKeys("A");
		driver.findElement(By.id("sex")).sendKeys("Male");
		driver.findElement(By.id("employmentStatus")).sendKeys("full-time");
		driver.findElement(By.id("age")).sendKeys("05/06/97");
		driver.findElement(By.id("maritalStatus")).sendKeys("Single");
		driver.findElement(By.id("username")).sendKeys("mohamed1997");
		driver.findElement(By.id("email")).sendKeys("mohamed.ismail341.com");
		driver.findElement(By.id("password")).sendKeys("666ismail");
		driver.close();

	}

}
