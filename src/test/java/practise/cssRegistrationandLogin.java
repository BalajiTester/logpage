package practise;

import java.util.Random;
import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssRegistrationandLogin {

	public static void main(String[] args) throws InterruptedException {
		Random r = new Random();
		   int i = r.nextInt(100);
		  String uName="balaji"+i;
		  String email="balaji"+i+"@gmail.com";
		  String pword="Balaji"+i;
		   
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		  Thread.sleep(2000);
		  userRegistration(driver,uName,email);
		  Thread.sleep(2000);
		  validatingLoginPage(driver);
		  Thread.sleep(2000);
		  userAbletoLogin(driver,email);
		  Thread.sleep(2000);
		  validatingRegisterPage(driver);
		  Thread.sleep(2000);
		  driver.close();	  
	}	  
	
	public static void userRegistration(WebDriver driver,String UName,String email) throws InterruptedException {
			
		driver.findElement(By.cssSelector("input[placeholder=\"Enter your name\"]")).sendKeys(UName);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder=\"Enter Your Email\"]")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder=\"Enter your password\"]")).sendKeys("balaji@1234");
		Thread.sleep(2000);	
        driver.findElement(By.cssSelector("	button[type=\"submit\"]")).click();	
	}
	
	public static void userAbletoLogin(WebDriver driver,String email) throws InterruptedException {
		driver.findElement(By.cssSelector("input[type=\"email\"]")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("balaji@1234");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href=\"/ui\"]")).click();	
	}
	
	public static void validatingLoginPage(WebDriver driver) {
			if(driver.getCurrentUrl().contains("login")) {
					System.out.println("we are in login page");
		}
	}
	
	public static void validatingRegisterPage(WebDriver driver) {
		if(driver.getCurrentUrl().contains("ui")) {
			System.out.println("finally we are traversed back to the  registration page");
		}
	}
	
}
