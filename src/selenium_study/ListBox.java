package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		
		//to select multiple option we need to select lisrbox example or dropdown
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		Thread.sleep(2000);
		d.manage().window().maximize();
		String url = d.getCurrentUrl();
		System.out.println("The current url is "+url);
		
		d.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		System.out.println("here we have clicked on (create new acount)button");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='firstname']")).sendKeys("MISSING");
		System.out.println("entered text (missing) in name field");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='lastname']")).sendKeys("YOU");
		System.out.println("Entered text (you)in the lastname field");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("BADLY");
		System.out.println("Entered email id (badly) in email field");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("ameyogita");
		System.out.println("Entered password");
		Thread.sleep(2000);
		
		// now using select class we are going to try list/dropdown box method
		
		WebElement dropdown = d.findElement(By.name("birthday_day"));
		Select s = new Select(dropdown);
		s.selectByValue("7");
		System.out.println("by using (selectbyVisibleText) we have selected 7 as birthday");
		Thread.sleep(2000);
		
		WebElement dropdown1 = d.findElement(By.name("birthday_month"));
		Select s1 = new Select(dropdown1);
		s1.selectByVisibleText("May");
		System.out.println("by using (selectByValue) entered birthday month");		
		Thread.sleep(2000);
		
		WebElement dropdown2 = d.findElement(By.name("birthday_year"));
		Select s2 = new Select(dropdown2);
		s2.selectByValue("1996");
		Thread.sleep(2000);
		
		
		
	}

}
