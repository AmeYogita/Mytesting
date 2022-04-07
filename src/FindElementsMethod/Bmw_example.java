package FindElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bmw_example {

	public static void main(String[] args) throws InterruptedException {
		
		 
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.co.in/");
		System.out.println("the link is ="+d.getCurrentUrl());
		System.out.println("===============================================");
		System.out.println("The title of page is ="+d.getTitle());
		Thread.sleep(1000);
		System.out.println("===============================================");
		
		d.findElement(By.name("q")).sendKeys("Bmw");
		System.out.println("Here we have entered text Bmw");
		Thread.sleep(1000);
		System.out.println("===============================================");
		
		List<WebElement> links = d.findElements(By.xpath("//ul//li"));
		Thread.sleep(1000);
		System.out.println("the present links are ="+links.size());
		System.out.println("===============================================");
		for(WebElement  w:links) {
		    String actual_result = w.getText();
			String expected_result = "bmw car";
			if(actual_result.equals(expected_result)) {
				w.click();
				break;
			}
		}
	
		
		d.findElement(By.xpath("//a[text()='Images']")).click();
		System.out.println("we have clicked on images option");
		Thread.sleep(1000);
		System.out.println("===============================================");
		List<WebElement> cars = d.findElements(By.tagName("a"));
		System.out.println("the links available in images search are ="+cars.size());
		Thread.sleep(1000);
		System.out.println("===============================================");
		
	}

}
