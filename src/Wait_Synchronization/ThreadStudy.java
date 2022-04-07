package Wait_Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadStudy {

	private static final JavascriptExecutor WebDriver = null;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.get("https://www.google.co.in/");
		
		d.manage().window().maximize();
		
		Thread.sleep(1000);
		
//		
//		JavascriptExecutor js = (JavascriptExecutor)WebDriver;
//		js.executeScript("document.getElementByxpath(\"//input[@title='Search'].value='bmw'");
//		
		
//		WebElement searchButton = d.findElement(By.xpath("//input[@title='Search']"));
//		searchButton.sendKeys("BMW");
//		Thread.sleep(100);
		
		
		
		
//		d.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
//		Thread.sleep(100);
	}

}
