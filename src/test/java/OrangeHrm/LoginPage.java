package OrangeHrm;


	

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class LoginPage {
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {

			driver = new ChromeDriver();
			LoginPage login = new LoginPage();

			String expectedTitle = "OrangeHRM";
			String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
			String actualTitle = driver.getTitle();
			String actualUrl = driver.getCurrentUrl();

			// System.out.println(actualTitle);
			// validating the login page
			if (actualUrl.equals(expectedUrl) && actualTitle.equals(expectedTitle)) {
				System.out.println("OrangeHRM web application is  opened |validation successful");
				Thread.sleep(4000);
				
				//1
				 login.validCredential(driver,"Login");
				 Thread.sleep(3000);
				 //2
				 login.invalidUserPassword();
				 Thread.sleep(4000);
				 
				 //3
				 login.validUserInvalidPassword();
				 Thread.sleep(4000);
				 //4
				 login.InvalidUservalidPassword();
				 Thread.sleep(4000);
				 
				 //5
				 login.blankUservalidPassword();
				 Thread.sleep(4000);
				//12
				login.forgetPassword();
				 Thread.sleep(4000);
				
			} else {
				System.err.println("OrangeHRM web application is not opend | validation failed");
			}

			driver.close();
		}

		public void forgetPassword() throws InterruptedException {

			driver.findElement(By.className("orangehrm-login-forgot")).click();
			Thread.sleep(2000);
			//driver.findElement(By.linkText("Forgot your password? ")).click();
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode";

			if (actualUrl.equals(expectedUrl)) {
				System.out.println("Reset password page is  opened | forgetPassword");
				Thread.sleep(2000);

			} else {
				System.err.println(" Reset password page is not opend | forgetPassword");

			}
		}

			public void validCredential(WebDriver driver,String page) throws InterruptedException {

			driver.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(2000);
			WebElement pass=driver.findElement(By.name("password"));
			pass.sendKeys("admin123");
			Thread.sleep(2000);
			
			/*
			 * calling login button because type is submit by using password web element
			 */		
			pass.submit();
			
			
			
			Thread.sleep(2000);
			
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

			//calling urlvalidation method
			urlValidation(actualUrl,expectedUrl,page,"validCredential", driver);
			
		}
		

		public void invalidUserPassword() throws InterruptedException {

			WebElement passwordtextfield;
			driver.findElement(By.name("username")).sendKeys("admin12");
			Thread.sleep(2000);
			passwordtextfield = driver.findElement(By.name("password"));
			passwordtextfield.sendKeys("admin1267");
			Thread.sleep(2000);

			// when the after password field next button is submit type button
			passwordtextfield.submit();
			Thread.sleep(2000);
			
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

			//calling urlvalidation method
			urlValidation(actualUrl,expectedUrl,"LoginPage","invalidUserPassword", driver);
		}

		public void validUserInvalidPassword() throws InterruptedException {

			driver.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("admin127");
			Thread.sleep(2000);
			driver.findElement(By.tagName("button")).click();

			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

			//calling urlvalidation method
			urlValidation(actualUrl,expectedUrl,"LoginPage","validUserInvalidPassword", driver);
		}

		public void InvalidUservalidPassword() throws InterruptedException {

			driver.findElement(By.name("username")).sendKeys("dameon");
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("admin123");
			Thread.sleep(2000);
			driver.findElement(By.tagName("button")).click();

			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

			//calling urlvalidation method
			urlValidation(actualUrl,expectedUrl,"LoginPage","InvalidUservalidPassword",driver);
		}

		public void blankUservalidPassword() throws InterruptedException {

			driver.findElement(By.name("username")).sendKeys("");
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("admin123");
			Thread.sleep(2000);
			driver.findElement(By.tagName("button")).click();

			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

			//calling urlvalidation method
			urlValidation(actualUrl,expectedUrl,"LoginPage","blankUservalidPassword", driver);
		}

			
		public void urlValidation(String actualUrl,String expectedUrl,String page,String methodName,WebDriver driver) throws InterruptedException {
			
			if (actualUrl.equals(expectedUrl)) {
				System.out.println("dashboard is  opened | "+methodName);
				Thread.sleep(2000);
				if(page.equals("Dashboard")) {
					
				}
				else{
					//logout(driver);
				
				}
				Thread.sleep(2000);
				
			} else {
				System.err.println(" dashboard is not opend | "+methodName);

			}
		}

	}



