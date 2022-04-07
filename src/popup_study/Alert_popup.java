package popup_study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		
		d.manage().window().maximize();
		Thread.sleep(1000);
		
		d.findElement(By.id("alertButton")).click();
		Thread.sleep(1000);
		Alert alertbutton = d.switchTo().alert();
		alertbutton.accept();
		System.out.println("you have clicked  on (OK) button in alertbutton window ");
		Thread.sleep(1000);

		d.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);
		Alert timerAlertButton = d.switchTo().alert();
		timerAlertButton.accept();
		System.out.println("you have clicked on (Ok) button in timerAlertButton");
		Thread.sleep(1000);
		
		d.findElement(By.id("confirmButton")).click();
		Thread.sleep(1000);
		Alert confirmButton = d.switchTo().alert();
		confirmButton.dismiss();
		System.out.println("you have clicked  on (DISMISS) button in alertbutton window ");
		
		d.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		Alert promtButton = d.switchTo().alert();
		promtButton.sendKeys("ameyogita");
		promtButton.accept();
		Thread.sleep(5000);
		
		
		
	}

}
