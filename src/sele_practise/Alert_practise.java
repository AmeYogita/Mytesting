package sele_practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_practise {

		public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver d = new ChromeDriver();
			d.get("http://demo.automationtesting.in/Alerts.html");
			d.manage().window().maximize();
			Thread.sleep(1000);
			
			WebElement alertbox = d.findElement(By.xpath("//button[@onclick='alertbox()']"));
			alertbox.click();
			Thread.sleep(1000);
			Alert alt=d.switchTo().alert();
			Thread.sleep(1000);
			alt.accept();
			Thread.sleep(1000);
			
			WebElement alertbox2 = d.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
			alertbox2.click();
			Thread.sleep(1000);
			d.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
			Thread.sleep(1000);
			Alert alt2=d.switchTo().alert();
			Thread.sleep(1000);
			alt2.dismiss();
			Thread.sleep(1000);
			
			WebElement textbox = d.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
			textbox.click();
			Thread.sleep(1000);
			WebElement text = d.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
			text.click();
			Thread.sleep(1000);
			Alert alt3 = d.switchTo().alert();
			alt3.sendKeys("I love yyou");
			Thread.sleep(1000);
			alt3.getText();
			alt3.accept();
			
	
			
			

	}
	
}
