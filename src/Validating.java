package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathalllocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(2000);
		selectButtonOption(driver);
		Thread.sleep(2000);
	}
	
	public static void selectButtonOption(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"/ui/button\"]")).click();
		
		selectingOptions(driver);
		
	}
	public static void selectingOptions(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='3']")).click();
		Thread.sleep(2000);
		WebElement messEle = driver.findElement(By.xpath("//span[text()='You selected \"3\"']"));
		Thread.sleep(2000);
		System.out.println("The message is displaying on webPage\t"+validatingElementDisplayedOrNot(messEle));
	}
public static boolean validatingElementDisplayedOrNot(WebElement messEle) {
	if(messEle.getText().contains("selected")) {
		
		return messEle.isDisplayed();
	}
	
	
	return false;
	
	
	
}
}
