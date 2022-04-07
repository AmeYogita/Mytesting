package iframe_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class study2 {

	public static void main(String[] args) throws InterruptedException {
	
		// pop up example
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//div[@class='exehdJ']")).click();
		Thread.sleep(1000);
		
		
		

	}

}
