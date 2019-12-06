package nssm12;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("qwerytu");
		driver.findElement(By.name("lastname")).sendKeys(" ytd");
		driver.findElement(By.name("reg_email__")).sendKeys("+918700428401");
		driver.findElement(By.name("reg_passwd__")).sendKeys("~!1234567~");
		driver.findElement(By.id("day")).sendKeys("28");
		driver.findElement(By.id("month")).sendKeys("Octd");
		driver.findElement(By.id("year")).sendKeys("2010");
		driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
		
		
		
		
		driver.findElement(By.name("websubmit")).click();
	}
}
		
		
		
		

