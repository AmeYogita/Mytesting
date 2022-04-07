package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vctc_site {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://vctcpune.com/");
		Thread.sleep(2000);
		
		d.navigate().to("https://vctcpune.com/selenium/practice.html");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//label[text()='Radio1']")).click();
		Thread.sleep(2000);
		System.out.println("here we have clicked on option radio 1");
		
		d.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("India");
		Thread.sleep(3000);
		System.out.println("here we have selected the input option and entered value in it by using sendkeys");
		
		d.findElement(By.xpath("//select[@name='dropdown-class-example']")).click();
		Thread.sleep(3000);
		System.out.println("here we are slelecting option from given data");
		
		d.findElement(By.xpath("//option[@value='option2']")).click();
		Thread.sleep(3000);
		System.out.println("here we have slelected option2 from given data");
		
		d.findElement(By.xpath("//label[@for='benz']")).click();
		Thread.sleep(3000);
		System.out.println("here we have selected the second option from actual data");
	
		
		
		
		
		
		
		
	}

}
