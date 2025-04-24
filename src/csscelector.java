package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class csscelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     Thread.sleep(2000);
	     driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
	    
	     Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
	    
	     Thread.sleep(2000);
	     
	    WebElement ele = driver.findElement(By.tagName("button"));
	    ele.click();
	    
	     
	     if(driver.getCurrentUrl().contains("index")) {
	    	 System.out.println("we are in dash board page");
	     }

	     Thread.sleep(2000);
	     
	     
	     driver.findElement(By.cssSelector("a[class='oxd-main-menu-item']")).click();
	     Thread.sleep(2000);
	     
	    if(driver.getCurrentUrl().contains("admin")) {
	    	System.out.println("we are in admin page");
	    }
            driver.close(); 
	}

}
