package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vctc1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://vctcpune.com/");
		System.out.println("the first url is "+d.getCurrentUrl());
		Thread.sleep(2000);
		d.manage().window().maximize();
		System.out.println("we maximized the window");
		Thread.sleep(2000);
		
		d.navigate().to("https://vctcpune.com/selenium/practice.html");
		System.out.println("we navigated to second page that is "+d.getTitle());
		Thread.sleep(2000);
		
		d.findElement(By.id("hide-textbox")).click();
		System.out.println("then we clicked on hide button ");
		Thread.sleep(2000);
		// then we are finding that the text box is enabled or disabled 
		// by using hide /show button we are able to find out .
		
		WebElement textbox = d.findElement(By.xpath("//input[@name='show-hide']"));
		boolean result=textbox.isEnabled();
		System.out.println("the button is enabled "+result);
		Thread.sleep(2000);
		if(result) {
			System.out.println("the text box button is not displayed because we clicked on hide button");
		}
		else {
			System.out.println("the text box button is displayed  ");
		}
		
		d.findElement(By.id("show-textbox")).click();
		Thread.sleep(2000);
		System.out.println("we have now clicked on show button");
		
		
		WebElement textbox1 = d.findElement(By.xpath("//input[@name='show-hide']"));
		boolean result1=textbox1.isDisplayed();
		System.out.println("the textbox is visible "+result1);
		if(result1) {
			System.out.println("the textbox is visible ");
		}
		else {
			System.out.println("the textbox is not visible .");
		}
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='show-hide']")).sendKeys("visible");
		Thread.sleep(2000);
		System.out.println("we have entered input that is (visible) ");
		
		//d.findElement(By.xpath(""))
		//Thread.sleep(2000);
		
		//d.findElement(By.xpath(""))
		//Thread.sleep(2000);

	}

}
