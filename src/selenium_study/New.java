package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		System.out.println("the current url is "+driver.getCurrentUrl());
		Thread.sleep(1000);
		
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("Yogita A. Thombe");
		Thread.sleep(1000);
		driver.findElement(By.id("userEmail")).sendKeys("thyogita65@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address'] ")).sendKeys("44/22 Lakxhman");
		Thread.sleep(1000);

		driver.findElement(By.id("permanentAddress")).sendKeys("At Kalamba BK ");
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
        //driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='impressiveRadio']")).click();
		Thread.sleep(1000);

	}
}
