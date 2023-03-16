package p2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class class1 {
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//Rajesh//Downloads//chromedriver_rajesh//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	System.out.println("orangehrm is opened");
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
	String beforelogin =driver.getTitle();
	System.out.println(beforelogin);
	driver.findElement(By.name("username")).sendKeys("Admin");
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	String afterlogin= driver.getTitle();
	System.out.println(afterlogin);
	if (beforelogin==afterlogin) {
		System.out.println("login successful");
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown-tab']")).click();
		}
	else {
		System.out.println("login failed");
	}
	Thread.sleep(2000);
	
			
	driver.close();
	
	}
		
	}


