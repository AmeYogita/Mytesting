package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study3 {

	public static void main(String[] args) throws InterruptedException {
		
		// in this we are going to use 
		// 1 sendkeys
		// 2 clear
		// 3 click
		// 4 getText
		// 5 isEnabled
		// 6 isSelected
		// 7 isDisplayed
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\Java\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		d.manage().window().maximize();
		Thread.sleep(2000);
	
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("ameynalawade8899@gmail.com");
		Thread.sleep(1000);
		System.out.println("Here we have used sendkeys method,we have send email address ");
		
		d.findElement(By.xpath("//input[@name='pass']")).sendKeys("ameyanalawade");
		Thread.sleep(1000);
		
		//d.findElement(By.xpath("//button[@name='login']")).click();
		//Thread.sleep(1000);
		//System.out.println("here we have used click method by clicking on login button ");
		
		
	
		WebElement web = d.findElement(By.xpath("//h2[contains(text(),'Facebook helps ')]"));
		
		String Actualtext = web.getText();
		System.out.println("the actual text is "+Actualtext);
		
		String Expectedtext = "Facebook helps you connect and share with the people in your life.";
		System.out.println("the expected text is "+Expectedtext);
		
		if(Actualtext.equals(Expectedtext)) {
			System.out.println("the actual text matches the expected text ");
		}
		else {
			System.out.println("the actual text does not matches the expected text ");
		}
		d.navigate().to("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Login = d.findElement(By.xpath("//button[@type='submit']"));
		
		boolean result = Login.isEnabled();
		System.out.println(result);
		
		if (result) {
			System.out.println("the button is enabled ");
		}
		else {
			System.out.println("The button is disabled ");
			
		}
		
	}

}
