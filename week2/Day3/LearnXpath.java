package week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
		
		driver.findElement(By.xpath("//input[contains(@class,'button r4 wide primary')]")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.linkText("Release Updates")).click();
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@class='slds-button slds-float_right slds-m-right_small js-button']")).click();
	}

}
