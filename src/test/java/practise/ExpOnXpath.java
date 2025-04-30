package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpOnXpath {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		login(driver);
		Thread.sleep(2000);
		admin(driver);
		Thread.sleep(2000);
		System.out.println(validatingAdminPage(driver));
		Thread.sleep(2000);
		userLogout(driver);
		Thread.sleep(2000);
		System.out.println(validateLoginPage(driver));
		
		driver.close();
	}
		public static void login(WebDriver driver) throws InterruptedException {
			
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		WebElement passEle = driver.findElement(By.name("password"));
		Thread.sleep(2000);
		passEle.sendKeys("admin123");
		
		passEle.submit();
		}
		
		
		public static void admin(WebDriver driver) throws InterruptedException {
		
String xpath="//div[@class='oxd-main-menu-search']/../following-sibling::ul/li[@class='oxd-main-menu-item-wrapper'][1]";
Thread.sleep(2000);
	driver.findElement(By.xpath(xpath)).click();
	
	
	String userXpath="//div[@class=\"oxd-grid-4 orangehrm-full-width-grid\"]/div/div/div/input[@class=\"oxd-input oxd-input--active\"]";
	Thread.sleep(2000);
	driver.findElement(By.xpath(userXpath)).sendKeys("admin");
	
	
	driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("admin2");
	
		}
	
	public static void userLogout(WebDriver driver) throws Throwable {
		
		driver.findElement(By.xpath("//p[text()='FirstNTest LastNaTest']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	public static String validatingAdminPage(WebDriver driver) {
		WebElement adPage = driver.findElement(By.xpath("//h6[text()='Admin']"));
		if(!(adPage.isDisplayed())) {
			return "We are not in admin page";
		}
			
			
		return "we are in admin page";
	}
	public static String validateLoginPage(WebDriver driver) {
		
		WebElement logEle = driver.findElement(By.xpath("//h5[text()='Login']"));
		if(!(logEle.isDisplayed())) {
			return "we are not came back to login page";
		}
		
		
		return "Finally we are in login page";
		
		
	}

}
