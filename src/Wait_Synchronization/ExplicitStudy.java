package Wait_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitStudy {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.get("https://www.discoveryplus.in/");
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		d.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		d.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		d.findElement(By.id("mobileNumber")).sendKeys("7972446715");
		
		WebElement getOtpButton = d.findElement(By.xpath("//button[@type='submit']"));
		
		WebDriverWait w = new WebDriverWait(d,Duration.ofMillis(1000));
		
		w.until(ExpectedConditions.visibilityOf(getOtpButton));
		
		getOtpButton.click(); 
		

	}

}
