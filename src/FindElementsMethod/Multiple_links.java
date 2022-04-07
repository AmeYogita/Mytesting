package FindElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_links {

	public static void main(String[] args) throws InterruptedException {
		 
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		d.manage().window().maximize();
		Thread.sleep(1000);
		
		List<WebElement> links = d.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(WebElement o:links) {
			System.out.println(o.getText());
		}
	}

}
