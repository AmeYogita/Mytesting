package FindElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tan {

	public static void main(String[] args) throws InterruptedException {
		 
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		
		WebElement SearchBox = d.findElement(By.xpath("//input[@title='Search']"));
		SearchBox.sendKeys("honda");
		Thread.sleep(1000);
		
		 List<WebElement> SuggestionSearchList = d.findElements(By.xpath("//ul//li"));
		 System.out.println("the size of the list is "+SuggestionSearchList.size());
		 
		for(WebElement w:SuggestionSearchList)
		{
			String s=w.getText();
			System.out.println(s);
			if(s.contains("honda amaze"))
			{
				w.click();Thread.sleep(1000);
				break;
			}
		}

	}

}
