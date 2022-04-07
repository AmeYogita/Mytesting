package FindElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("the link is = "+d.getCurrentUrl());
		System.out.println("===============================================");
		System.out.println("The title of page is = "+d.getTitle());
		Thread.sleep(1000);
		System.out.println("===============================================");
		
		List<WebElement> column = d.findElements(By.xpath("//table[@id='product']//tr//th"));// th = table header
		System.out.println("Total number of colums are "+column.size());
		int colums =column.size();
		Thread.sleep(1000);
		System.out.println("===============================================");
		
		List<WebElement> rows = d.findElements(By.xpath("//table[@id='product']//tr"));//tr = table row
		System.out.println("Total number of rows are "+rows.size());
		int rows1=rows.size();
		Thread.sleep(1000);
		System.out.println("===============================================");
		
		// outer for loop for rows
		for(int i=1;i<=rows1;i++) {
			//inner for loops for column
			String text;
			for(int j=1;j<=colums;j++) {
				if(i==1) {
					text = d.findElement(By.xpath("//table[@id='product']//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(text+"||");
				
				}
				else {
					text=d.findElement(By.xpath("//table[@id='product']//tr["+i+"]//td["+j+"]")).getText();// td = table data
					System.out.print(text+"///");
				}
			}
		}
	}

}
