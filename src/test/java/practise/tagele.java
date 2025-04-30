package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagele {

	public static void main(String[] args) throws Throwable {
		WebDriver dri=new ChromeDriver();
		dri.manage().window().maximize();
		dri.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
       dri.findElement(By.className("commonModal__close")).click();
       
    List<WebElement> button = dri.findElements(By.tagName("button"));
       int count=0;
       
       for(WebElement ref:button) {
    	   count++;
    	   System.out.println(ref.getText());
       }
       System.out.println("the total no of buttons are:"+count);
       
	}

}
