package OrangeHrm;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class AdminMenu {
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
			
					
		}

		
		

		//for selecting user management dropdown
		public void adminMenu(WebDriver driver) throws InterruptedException {
			List <WebElement> menuItem=driver.findElements(By.className("oxd-main-menu-item"));
			for(WebElement i:menuItem) {
				System.out.println(i.getText()+" button is clicked");
				if(i.getText().contains("Admin")) {
					i.click();
					//menuUrlValidate(driver,"Admin");
					break;
				}
			}
			
			
			driver.findElement(By.className("oxd-topbar-body-nav-tab-item")).click();
			Thread.sleep(3000);
			driver.findElement(By.className("oxd-topbar-body-nav-tab-link")).click();
			Thread.sleep(5000);
		}
		
		
		}

