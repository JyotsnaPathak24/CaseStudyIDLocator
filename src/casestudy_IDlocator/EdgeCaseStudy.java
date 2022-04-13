package casestudy_IDlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeCaseStudy {
	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver"
				,"C:\\Users\\harsh\\eclipse-workspace\\CasestudyIDLocator\\BrowserJars\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		driver.findElement(By.name("email")).sendKeys("Jyotsnapathak24@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Lucknow123@");
		
}
}