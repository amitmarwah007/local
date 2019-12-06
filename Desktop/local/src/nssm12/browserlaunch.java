package nssm12;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;


public class browserlaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 String baseUrl = "https://accounts.google.com/login/identifier?flowName=GlifWebSignIn&flowEntry=AddSession";					
	        driver.get(baseUrl);
	        driver.findElement(By.id("identifierId")).sendKeys("amitmarwahanew@gmail.com");
	        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
	        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
	      

	       						

	       
	}
}



