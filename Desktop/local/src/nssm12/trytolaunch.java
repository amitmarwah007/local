package nssm12;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class trytolaunch {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
			System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();	
			driver.get("https://www.guru99.com/software-testing.html");
			String StringName = driver.findElement(By.linkText("DevOps")).getText();
			System.out.println(StringName);
	}
}
	
	
			
			
	
