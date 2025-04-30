package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://jqueryui.com/datepicker/");
		
//		 WebElement fra = dr.findElement(By.className("demo-frame"));
//		
//		dr.switchTo().frame(fra);
//		Thread.sleep(2000);
//		 dr.findElement(By.id("datepicker")).click();
		
		
//		dr.switchTo().frame(fra1);
//		Thread.sleep(2000);
//		dr.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("balaji");
//		Thread.sleep(2000);
//		
//		dr.switchTo().defaultContent();
//		String text = dr.findElement(By.xpath("//h1[text()=\"Frame\"]")).getText();
//		if(text.equals("Frame")) {
//			System.out.println("we are in default page");
		}
		
	}


