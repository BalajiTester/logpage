package practise;

import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\\\www.facebook.com");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	 driver.navigate().to("https:\\instagram.com");
	 Thread.sleep(2000);
	  
	 driver.manage().window().setSize(new Dimension(250,250));
	 Thread.sleep(2000);
	 driver.manage().window().setPosition(new org.openqa.selenium.Point(300, 400));
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.navigate().back();
	 Thread.sleep(2000);
	 driver.navigate().forward();;
	 Thread.sleep(2000);
	 driver.navigate().refresh();
	 Thread.sleep(2000);
	 
	 if(driver.getTitle().equals("instagram")){
		 System.out.println("application validated");
	 }
	}

}
