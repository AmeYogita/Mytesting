package selenium_study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Tools2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/text-box");
		System.out.println("the current url is "+d.getCurrentUrl());
		Thread.sleep(1000);
		
		d.manage().window().maximize();
		System.out.println("after that we have maximized the window");
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("Ameya Nalawade");
		Thread.sleep(1000);
		System.out.println("now we have gave input ");
		
		d.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("ameyanalawade8899@gmail.com");
		Thread.sleep(1000);
		System.out.println("now we have entered email ");
		
		d.findElement(By.xpath("//textarea[@id=\"currentAddress\"]")).sendKeys("Prakash kiran soc ,flat no 106 ,katraj");
		Thread.sleep(1000);
		System.out.println("now we have entered current address ");
		
		d.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]")).sendKeys("Prakash kiran soc ,flat no 106 ,katraj");
		Thread.sleep(1000);
		System.out.println("now we have entered permanent address ");
		
		//JavascriptExecutor j = ((JavascriptExecutor)d);
		//j.executeScript("scroll(0.1000)");
		
		d.findElement(By.xpath("//button[@class='btn btn-primary']")).click(); 
		Thread.sleep(1000);
		System.out.println("now we have pressed submit button ");
	
		
		File Source = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		RandomString s = new RandomString(2);
		File Destination=new File("D:\\Screenshot\\adeosq"+s+".jpg");
		FileHandler.copy(Source, Destination);
		System.out.println("now we have taken screenshot ");
		
		d.findElement(By.xpath("//span[text()='Check Box']")).click();
		Thread.sleep(1000);
		System.out.println("now we have clicked on check box button");
		
		d.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		Thread.sleep(1000);
		System.out.println("now we have clicked on check box ");
		
		d.findElement(By.xpath("//span[text()='Radio Button']")).click();
		Thread.sleep(1000);
		System.out.println("now we have clicked on radio button  ");
		
		d.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
		Thread.sleep(1000);
		System.out.println("now we have clicked on impressive button ");
		
		d.findElement(By.xpath("//span[text()='Web Tables']")).click();
		Thread.sleep(1000);
		System.out.println("now we have clicked o tables option ");
		
		d.findElement(By.xpath("//button[text()='Add']")).click();
		Thread.sleep(1000);
		System.out.println("now we have clicked on add button ");

		d.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ameya");
		Thread.sleep(1000);
		System.out.println("now first name has been inserted ");
		
		d.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Nalawade");
		Thread.sleep(1000);
		System.out.println("now  lastname has been inserted ");
		
		d.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("ameynalawade8899@gmail.com");
		Thread.sleep(1000);
		System.out.println("now email has been inserted ");
		
		d.findElement(By.xpath("//input[@id='age']")).sendKeys("27");
		Thread.sleep(1000);
		System.out.println("now age has been inserted ");
		
		d.findElement(By.xpath("//input[@id='salary']")).sendKeys("55555555");
		Thread.sleep(1000);
		System.out.println("now salary has been inserted ");
		
		d.findElement(By.xpath("//input[@id='department']")).sendKeys("telecom ");
		Thread.sleep(1000);
		System.out.println("now department  has been inserted ");
		
		File Source1 = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		RandomString s1 = new RandomString(2);
		File Destination1=new File("D:\\Screenshot\\adeosq"+s1+".jpg");
		FileHandler.copy(Source1, Destination1);
		System.out.println("now screenshot has been taken");
		
		d.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(1000);
		System.out.println("program has ended");
		
		
		
		
		
	}

}
