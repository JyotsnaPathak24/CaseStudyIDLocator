package casestudy_IDlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxCaseStudy {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver"
				,"C:\\\\Users\\\\harsh\\\\eclipse-workspace\\\\LaunchFirefox\\\\FirefoxBrowserJars\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		driver.findElement(By.name("email")).sendKeys("Jyotsnapathak24@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Lucknow123@");

}
	
}
