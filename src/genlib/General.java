package genlib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeClass;

public class General extends Global {

	WebDriver driver;
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32/chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("Chrome Browser is opened");

	}

	public void openApplication() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println("Orange HRM Page is opened");
	}
	public void login() {
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login is opened sucessfully");
		
	}
	public void close() {
		driver.close();
		System.out.println("Browser is closed sucessfully");
		
	}
}
