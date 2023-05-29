package week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
         
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         
         driver.findElement(By.className("decorativeSubmit")).click();
         
         driver.findElement(By.linkText("CRM/SFA")).click();
         Thread.sleep(3000);
         
         driver.findElement(By.linkText("Leads")).click();
         Thread.sleep(3000);
         
         driver.findElement(By.linkText("Create Lead")).click();
         Thread.sleep(3000);
         WebElement obj1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
         
         Select op = new Select(obj1);
         
         op.selectByValue("IND_SOFTWARE");
         
         WebElement obj2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
         
         Select op1 = new Select(obj2);
         
         op1.selectByIndex(3);
         
         WebElement obj3 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
         
         Select op2 = new Select(obj3);
         
         op2.selectByVisibleText("Armed Forces Americas");
         Thread.sleep(5000);
         
         driver.close();
         

	}

}
