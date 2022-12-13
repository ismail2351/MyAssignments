package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchEdgeDriver {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ismail");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ismail");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("A");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("software tester");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("software testing engineer");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("7271");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("30");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("412000202");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("TL");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Employee with good work ethics");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Employee with both automation and manual testing knowledge");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9600089390");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("software tester");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mohamedismail123@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.testleaf.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("mohamed");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Md ismail");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("no 89/122 gnt road");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("no 55/88 saravanan street");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("118");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600118");
		driver.findElement(By.className("smallSubmit")).click();
		
		

	}

}
