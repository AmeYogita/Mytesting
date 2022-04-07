package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study2 {

	public static void main(String[] args) throws InterruptedException {
	
		
		// here we are going to practise how the inspect,then give input using selenium
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.instagram.com/");
		Thread.sleep(4000);
		//d.manage().window().maximize();
		//Thread.sleep(2000);
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("missing you");
		Thread.sleep(4000);
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("not@all");
		Thread.sleep(4000);
		d.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).click();
		Thread.sleep(4000);
		

	}

}
