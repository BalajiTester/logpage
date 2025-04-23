package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.facebook.com");
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		Thread.sleep(3000);
		int count=0;
		for(WebElement r:ele) {
			count++;
			Thread.sleep(1000);
			System.out.println(r.getText());
		}
     System.out.println("total no of links:"+count);
	}

}
