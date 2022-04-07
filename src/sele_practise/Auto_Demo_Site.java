package sele_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Demo_Site {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(1000);
		d.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println("the current url is "+d.getCurrentUrl());
		System.out.println("the title of website "+d.getTitle());
		
		WebElement first_name = d.findElement(By.xpath("//input[@placeholder='First Name']"));
		first_name.sendKeys("Ameya");
		
		WebElement last_name = d.findElement(By.xpath("//input[@placeholder='Last Name']"));
		last_name.sendKeys("Nalawade");
		
		WebElement address = d.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys("Katraj");
		
		WebElement email = d.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		email.sendKeys("ameynalawade8899@gmail.com");
		
		WebElement phone = d.findElement(By.xpath("//input[@ng-model='Phone']"));
		phone.sendKeys("9689099595");
		
		WebElement male = d.findElement(By.xpath("//input[@value='Male']"));
		male.click();
		
		JavascriptExecutor js = ((JavascriptExecutor)d);
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement hobbies = d.findElement(By.xpath("//label[text()=' Cricket ']"));
		hobbies.click();
		
		WebElement lang = d.findElement(By.xpath("//div[@style='min-height:30px;max-width:200px']"));
		lang.sendKeys("Hindi");
		
//		d.findElement(By.xpath(""))
//		js.executeScript("window.scrollintoView()",lang);
		
			
			
			}
		
		

	}


