package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	  
	 driver.manage().window().maximize();
	 driver.get("https://demoapps.qspiders.com/ui");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//li[text()='Without placeholder']")).click();
	 
	 
	 
	 driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys();
	 driver.findElement(By.xpath("")).sendKeys(args);
	}

}
