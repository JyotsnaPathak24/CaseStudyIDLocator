package casestudy_IDlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeCaseStudy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver"
				,"C:\\\\Users\\\\harsh\\\\eclipse-workspace\\\\Locators in Selenium\\\\SeleniumBrowserJars\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		driver.findElement(By.name("email")).sendKeys("Jyotsnapathak24@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Lucknow123@");
}
}