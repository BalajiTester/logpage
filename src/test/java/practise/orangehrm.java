package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     Thread.sleep(2000);
     driver.findElement(By.name("username")).sendKeys("Admin");
    
     Thread.sleep(2000);
    driver.findElement(By.name("password")).sendKeys("admin123");
    
     Thread.sleep(2000);
     
    WebElement ele = driver.findElement(By.tagName("button"));
    ele.click();
    
     
     if(driver.getCurrentUrl().contains("index")) {
    	 System.out.println("we are in dash board page");
     }
   driver.close();  
 }

}
