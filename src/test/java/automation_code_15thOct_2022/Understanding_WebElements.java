package automation_code_15thOct_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Understanding_WebElements {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
	driver.findElement(By.className("signin")).click();
	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.name("passwd")).sendKeys("Selenium@123");
	driver.findElement(By.className("signinbtn")).click();
	Thread.sleep(2000);
	driver.findElement(By.className("rd_logout")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]")).click();
		

	}

}
