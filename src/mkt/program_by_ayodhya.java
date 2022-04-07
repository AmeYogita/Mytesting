package mkt;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_by_ayodhya {

	public static void main(String[] args) throws InterruptedException {
		

		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		System.out.println("The URL of webpage is "+driver.getCurrentUrl());
		System.out.println("=====================================");
		System.out.println("Title of webpage is "+driver.getTitle());
		Thread.sleep(2000);
		System.out.println("=====================================");
		
//		Alert alt= driver.switchTo().alert();
//		alt.accept();
////		
//		WebElement alert = driver.findElement(By.xpath("//div[@class='ic-close-quickview']"));
//		alert.click();
////		System.out.println("Now we have closed the popup ");
//		Thread.sleep(2000);
//		System.out.println("=====================================");
//		
		
	    List<WebElement> Links = driver.findElements(By.tagName("a"));
	    System.out.println("Links available on the webpage is  "+Links.size());
		Thread.sleep(2000);
	    System.out.println("=====================================");
	    
	    
	   driver.findElement(By.xpath("//a[@title='MEN']")).click();
	   System.out.println("Now we have clicked on MEN section");
		Thread.sleep(2000);
	   System.out.println("=====================================");
	    
	    
		
		
		
	}

}
