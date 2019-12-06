package nssm12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class newlaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Amit/Desktop/NSSM12.html");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");
		
		 driver.findElement(By.id("email")).sendKeys("amit.marwaha007@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.name("pass")).sendKeys("qwerty@12345678");
		 driver.findElement(By.id("loginbutton")).click();
		 Thread.sleep(3000);
		
		 WebElement logOut = driver.findElement(By.id("userNavigationLabel"));
		 logOut.click();
		 Thread.sleep(5000);
		 WebElement signOut = driver.findElement(By.partialLinkText("Log Out"));
		 signOut.click();
	}
}


		
	


