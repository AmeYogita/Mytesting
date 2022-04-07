package sele_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Frames.html");
		Thread.sleep(1000);
		d.manage().window().maximize();
		Thread.sleep(1000);
		WebElement mainFrame = d.findElement(By.xpath("//iframe[@id='singleframe']"));
		Thread.sleep(1000);
		d.switchTo().frame(mainFrame);
		d.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("thanks tanmay");
		Thread.sleep(1000);
		
		d.switchTo().defaultContent();
		Thread.sleep(1000);
		
		WebElement newFrame = d.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		newFrame.click();
	
		Thread.sleep(1000);
		WebElement outerframe = d.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		d.switchTo().frame(outerframe);
		
		WebElement nested = d.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		d.switchTo().frame(nested);
		Thread.sleep(1000);
		d.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chod diye bhaiyaji");
		Thread.sleep(1000);
		
		

	}

}
