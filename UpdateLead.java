package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateLead {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 
		 // Identify password field and enter the password
		 
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 //Click On Login
		 
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
	     //Click On CRM/SFA
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 driver.findElement(By.linkText("Leads")).click();
		 
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Muthu");
		 
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
		 
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("selvi");
		 
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		 
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Computer science");
		 
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("muthu@gmail.com");
		 
		 WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 
		 Select dd = new Select(dropdown);
		 
		 dd.selectByVisibleText("New York");
		 
		 driver.findElement(By.name("submitButton")).click();
		 
		 String title = driver.getTitle();
		 
		 System.out.println(title);
		 
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 
		 driver.findElement(By.id("createLeadForm_companyName")).clear();
		 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		 
		 driver.findElement(By.id("createLeadForm_firstName")).clear();
		 
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Esakki");
		 
		 driver.findElement(By.name("submitButton")).click();
		 
		 
		 
		
		
	}
	

}
