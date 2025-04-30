package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllProducts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");

		 searchingForProduct(driver);
		 
		 
		 System.out.println("The total list of products of iphone 16 is:"+printingAllProductsName(driver));
	}
	public static void searchingForProduct(WebDriver driver) {
		
		  driver.findElement(By.name("q")).sendKeys("iphone 16");
				 
				 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
				 
				
			}
	
	public static int printingAllProductsName(WebDriver driver) throws InterruptedException   {
		int count=0;
		List<WebElement> allEle = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		for(WebElement ref:allEle) {
			Thread.sleep(1000);
			System.out.println(ref.getText());
			count++;
		}
		return count;
	}

}
