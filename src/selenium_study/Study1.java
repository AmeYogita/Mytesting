package selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.manage().window().minimize();
		Thread.sleep(4000);
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		String title= driver.getTitle();
		System.out.println("title of web page is "+title);
		String url= driver.getCurrentUrl();
		System.out.println("url of web page is  "+url);
		
		
		
		
	
}}