package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TamilMatrimony {

	public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.tamilmatrimony.in/");
			driver.manage().window().maximize();
			driver.findElement(By.id("REGISTERED_BY")).sendKeys("Myself");
			driver.findElement(By.id("NAME")).sendKeys("ismail");
			driver.findElement(By.id("gendermale")).click();
			driver.findElement(By.id("DOBDAY")).sendKeys("02");
			driver.findElement(By.id("DOBMONTH")).sendKeys("06");
			driver.findElement(By.id("DOBYEAR")).sendKeys("1997");
			driver.findElement(By.id("RELIGION")).sendKeys("Muslim - Others");
			driver.findElement(By.id("MOTHERTONGUE")).sendKeys("Tamil");
			driver.findElement(By.id("COUNTRY")).sendKeys("India");
			driver.findElement(By.id("M_COUNTRYCODE")).sendKeys("+91");
			driver.findElement(By.id("MOBILENO")).sendKeys("9566090803");
			driver.findElement(By.id("EMAIL")).sendKeys("mohamed.ismail341@gmail.com");
			driver.findElement(By.id("PASSWORD")).sendKeys("123ismail");
			driver.close();
	}

}
