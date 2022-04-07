package FindElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("the link is = "+d.getCurrentUrl());
		System.out.println("===============================================");
		System.out.println("The title of page is = "+d.getTitle());
		Thread.sleep(1000);
		System.out.println("===============================================");
		
		List<WebElement> Table = d.findElements(By.tagName("table"));
		System.out.println("the size of the table is = "+Table.size());
		Thread.sleep(1000);
		System.out.println("===============================================");
		
		List<WebElement> header = d.findElements(By.xpath("//table//th"));
		System.out.println("The header of table is ");
		for(WebElement a:header) {
			
			System.out.print(a.getText()+" || ");
		}
		System.out.println();
		
		
		 
		for(WebElement w:Table) {
			System.out.print(w.getText()+"||");
			
		}
		  

	}

}
