package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class normal {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https:\\www.myntra.com");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.className("desktop-searchBar"));
		ele.sendKeys("lipistick");
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.className("desktop-submit"));
		ele1.click();
		Thread.sleep(2000);
		
		if(driver.getCurrentUrl().equals("https://www.myntra.com/lipistick")) {
			
			System.out.println("we are in lipstic product list page");
			
		}
		driver.close();
	}

}
