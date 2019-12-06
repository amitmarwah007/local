package nssm12;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
		FirefoxDriver cd=new FirefoxDriver();

	}

}
