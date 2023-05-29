package week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_3c01r1321r_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=610714031509&hvpos=&hvnetw=g&hvrand=7799403339013847480&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007804&hvtargid=kwd-32679660&hydadcr=14454_2316419");
		
		driver.findElement(By.linkText("Best Sellers")).click();
		
		driver.findElement(By.linkText("Apps for Android")).click();
	}

}
