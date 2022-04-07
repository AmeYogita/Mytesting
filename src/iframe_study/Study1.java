package iframe_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/nestedframes");
		Thread.sleep(1000);
		
		//d.manage().window().maximize();
		//Thread.sleep(2000);
		
		d.switchTo().frame("frame1");
		Thread.sleep(1000);
		
		WebElement parent_frame = d.findElement(By.xpath("//body[text()='Parent frame']"));
		
		String actual_text="Parent frame";
		
		String expected_text = parent_frame.getText();
	
	
		System.out.println(expected_text);
		
		if(actual_text.equals(expected_text)) 
		{
			System.out.println("The actual text matches the expected text , so test case is passed");
			
		}
		else {
			System.out.println("The actual text does not matches the expected text , so test case is failed");
		}
		
		WebElement child_frame_entry = d.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		
		d.switchTo().frame(child_frame_entry);
		
		//d.findElement(By.xpath("//body[text()='Child Iframe']")).getText();
		
		String actualtext_child = "Child Iframe";
		
		String expectedtext_child = d.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println(expectedtext_child);
		
		if(actualtext_child.equals(expectedtext_child)) {
			
			System.out.println("The actual text matches the expected text , so test case is passed of child");
		}
		else {
			System.out.println("The actual text does not matches the expected text , so test case is failed of child");
		}
		
	
	}
	
	

}
