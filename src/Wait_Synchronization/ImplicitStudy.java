package Wait_Synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitStudy {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.get("https://www.google.co.in/");
		
		d.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		

	}

}
