package nssm12;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 

public class demo {
	
	private static WebDriver driver;

	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		
		driver.get("http://artoftesting.com");
		driver.quit();
	}

}

