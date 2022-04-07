package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Faceboook {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		Thread.sleep(4000);
		
		d.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='firstname']")).sendKeys("AmSaTaPaHi");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='lastname']")).sendKeys("NaSaBhPiAk");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123455678");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("iloveyou");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//select[@name='birthday_day']")).click();
		d.findElement(By.xpath("//option[text()='5']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//select[@name='birthday_month']")).click();
		d.findElement(By.xpath("//option[text()='May']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//select[@name='birthday_year']")).click();
		d.findElement(By.xpath("//option[text()='1993']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	}

}
