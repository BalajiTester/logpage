package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingDynamicElement {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		 driver.findElement(By.name("q")).sendKeys("iphone 16");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		Thread.sleep(2000);
		WebElement nameEle = driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (White, 128 GB)']"));
		
		
		
		
		String xpath="//div[text()='Apple iPhone 16 (White, 128 GB)']/../following-sibling::div/div/div/div[@class='Nx9bqj _4b5DiR']";
		Thread.sleep(2000);
		
		String price = driver.findElement(By.xpath(xpath)).getText();
		
		System.out.println(nameEle.getText()+"-->"+""+price);
		

	}

}
