package FindElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_crickbuzz {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.cricbuzz.com/cricket-series/3202/icc-womens-world-cup-2022/stats");
		System.out.println("the link is = "+d.getCurrentUrl());
		System.out.println("===============================================");
		System.out.println("The title of page is = "+d.getTitle());
		Thread.sleep(1000);
		System.out.println("===============================================");
		d.manage().window().maximize();
		Thread.sleep(1000);
		
		List<WebElement> links = d.findElements(By.tagName("a"));
		System.out.println("Total links available on webpage are = "+links.size());
		Thread.sleep(1000);
		System.out.println("===============================================");
		
		WebElement text = d.findElement(By.xpath("//h1[text()='ICC Womens World Cup 2022']"));
		System.out.println("title of the table is "+text.getText());
		Thread.sleep(1000);
		System.out.println("===============================================");
		
		List<WebElement> rows = d.findElements(By.xpath("//table[@class='table table-responsive cb-series-stats']//tr[1]//th"));
		int totalRows = rows.size();
		System.out.println("Total no of rows are = "+totalRows);
		int finalRows = totalRows;
		System.out.println("===============================================");
		System.out.println("Final rows are = "+finalRows);
		
		
		
		List<WebElement> columns = d.findElements(By.xpath("//table[@class='table table-responsive cb-series-stats']//tr"));
		int totalColumns = columns.size();
		System.out.println("Total no of columns are = "+totalColumns);
		System.out.println("===============================================");
		int finalColumns = totalColumns;
		System.out.println("Final columns are = "+finalColumns);
		for(WebElement w:rows) {
			System.out.print(w.getText()+" || ");
		}
		System.out.println();
		
		for(int i =1;i<=finalColumns-1;i++) 
		{
			for(int j=1;j<=finalRows;j++) 
			{
				
					String value2 = d.findElement(By.xpath("//table[@class='table table-responsive cb-series-stats']//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(value2+" || ");
					
				}
			System.out.println();
			}
			
			
		}
	}

