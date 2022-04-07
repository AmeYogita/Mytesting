package FindElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_icc {

	public static void main(String[] args) throws InterruptedException {
	
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.cricbuzz.com/cricket-series/3202/icc-womens-world-cup-2022/points-table");
		System.out.println("the link is = "+d.getCurrentUrl());
		System.out.println("===============================================");
		System.out.println("The title of page is = "+d.getTitle());
		Thread.sleep(1000);
		System.out.println("===============================================");
		
		List<WebElement> links = d.findElements(By.tagName("a"));
		System.out.println("Links available on page is = "+links.size());
		Thread.sleep(1000);
		System.out.println("===============================================");
		
		WebElement TableName = d.findElement(By.xpath("//h3[text()='ICC Womens World Cup 2022 - Points Table']"));
		System.out.println("The name of the Table is = "+TableName.getText());
		Thread.sleep(1000);
		System.out.println("===============================================");
		
		WebElement table = d.findElement(By.xpath("//table[@class='table cb-srs-pnts']"));
		
		List<WebElement> head = d.findElements(By.xpath("//table[@class='table cb-srs-pnts']//tr//th"));
		System.out.println(head.size());
		int totalhead = head.size();
		System.out.println("===============================================");
		List<WebElement> columns = d.findElements(By.xpath("//table[@class='table cb-srs-pnts']//tr//td"));
		int totalcolumns = columns.size();
		System.out.println("total no of columns = "+totalcolumns);
	//	for(int i=1;i<=totalhead;i++) {
			
		//}
		
		
		
		

	}

}
