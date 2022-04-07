package mkt;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\update chrome\\chromedriver.exe");
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://www.amazon.in/");
		d.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		List<WebElement> links = d.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println(count +" links are present on page");
		
		for(WebElement link:links) {
			String url=link.getAttribute("href");
			if(url==null || url.isEmpty()) {
				System.out.println(url +" is empty");
				continue;
			}
			
			try {
				
				HttpURLConnection a = (HttpURLConnection)(new URL(url).openConnection());
				a.connect();
				
				if(a.getResponseCode()>=400) {
					System.out.println(url+ "  is broken & Response Code is "+ a.getResponseCode());
				}
				else {
					System.out.println(url+ "  is valid & Response Code is " +a.getResponseCode());
				}
				
				
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		d.quit();
		
	}

	
		
		
	
}
