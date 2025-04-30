package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 
		 searchingForProduct(driver);
		 
		Thread.sleep(2000);
		
		 ValidatingProductPage(driver);
		 Thread.sleep(2000);
		 PrintingAndClickOnFirstOption(driver);
		
		 Thread.sleep(2000);
		driver.quit();
		
	}
	public static void searchingForProduct(WebDriver driver) {
		
  driver.findElement(By.name("q")).sendKeys("iphone 16");
		 
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		 
		
	}
	
	
	public static void ValidatingProductPage(WebDriver driver) throws InterruptedException {
		
		WebElement mesEle = driver.findElement(By.xpath("//span[@class=\"BUOuZu\"]"));
		
		if(mesEle.getText().contains("for")) {
			System.out.println("we are in product list page");
		}
		else {
			System.out.println("product list page is not showing");
		}
	}
	
	public static void PrintingAndClickOnFirstOption(WebDriver driver) throws InterruptedException {
		
WebElement prodName = driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Teal, 128 GB)']"));
		
		System.out.println("the first product name is:"+prodName.getText());
		
		Thread.sleep(2000);
		prodName.click();
		
		
	}
	

}
