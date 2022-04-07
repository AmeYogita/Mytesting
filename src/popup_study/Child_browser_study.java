package popup_study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser_study {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		d.manage().window().maximize();
		Thread.sleep(1000);
		
		Set<String> MainpageWindow = d.getWindowHandles();
		System.out.println("now we have got main window page ID");
		System.out.println("The id of main window page is "+MainpageWindow);
		
		d.findElement(By.xpath("//input[@value='New Window']")).click();
		System.out.println("Now we have clicked on ( New Window )button");
		Thread.sleep(1000);
		
	    Set<String> allWindowsID = d.getWindowHandles();
	    System.out.println("Now we have got ID of all windows");
	    System.out.println("ID of all windows page is "+allWindowsID);
	    
	    Iterator<String> all = allWindowsID.iterator(); // the iterator will start from -1 so that,when we click on next it will move to 
	    String mainpage = all.next();                   // this which is at 0 index then it will move to                  
	    String childpage = all.next();                  // this which is at 1 index 
	    
	    System.out.println("Now we have ID of all frame no we are going to switch our focus from main page to child windoe");
	    Thread.sleep(1000);
	    
	    d.switchTo().window(childpage);
	    System.out.println("Focused switch to child page ");
	    Thread.sleep(1000);
	    d.manage().window().maximize();
	    Thread.sleep(1000);
	    
	    d.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	    System.out.println("now we have clicked on trainning button");
	    d.close();
	    Thread.sleep(1000);
	    System.out.println("we have closed the child window ");
	    
	    d.switchTo().window(mainpage);
	    System.out.println("No we have again switch focus to main page ");
	    
	}

}
