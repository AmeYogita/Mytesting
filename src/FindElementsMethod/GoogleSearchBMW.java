package FindElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchBMW {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		d.manage().window().maximize();
		Thread.sleep(1000);
		
	
		d.findElement(By.xpath("//input[@title='Search']")).sendKeys("bmw");
		Thread.sleep(1000);
		
		List<WebElement> search = d.findElements(By.xpath("//ul//li"));
		
		System.out.println(search.size());
		
		for(WebElement a:search) {
			
			String se=a.getText();
			System.out.println(se);
			if(se.equals("bmw car")) {
				a.click();
			}
		}
		
		

	}

}
