package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll1 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/text-box");
		System.out.println("the current url is "+d.getCurrentUrl());
		System.out.println("the title is "+d.getTitle());
		Thread.sleep(1000);
		
		d.manage().window().maximize();
		Thread.sleep(1000);

		d.findElement(By.xpath("//input[@id='userName']")).sendKeys("ameya nalawade");
		Thread.sleep(1000);
		System.out.println("In input option of user name we have entered ameya nalawade ");
		
		
		d.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("ameynalawade8899@gmail.com");
		Thread.sleep(1000);
		System.out.println("in usermail we have entered ameynalawade8899@gmail.com");
		
		d.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("katraj");
		Thread.sleep(1000);
		System.out.println("in current address we have entered katraj ");
		
		Actions act = new Actions(d);
		act.sendKeys(Keys.TAB).keyDown(Keys.SHIFT).sendKeys("katraj").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(1000);
		System.out.println("Now by using keyboards actions we have entered katraj in capital letters ");
		
		 JavascriptExecutor js = (JavascriptExecutor)d;
		 js.executeScript("window.scrollBy(0,200)");
		 Thread.sleep(1000);
			System.out.println("here we have scroll down mouse ");
		 
		d.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(1000);
		System.out.println("now we have clicked on buttons option");
	
    	d.findElement(By.xpath("//span[text()='Check Box']")).click();
		Thread.sleep(1000); 
		System.out.println("now we have clicked on check box option");
		
		d.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		Thread.sleep(1000);	
		System.out.println("now we have clicked on check box option which is home button");
		
		d.findElement(By.xpath("//span[text()='Radio Button']")).click();
		Thread.sleep(1000);	
		System.out.println("now we have clicked on radio button");
		
	    d.findElement(By.xpath("//label[text()='Impressive']")).click();
		Thread.sleep(1000);	
		System.out.println("we have clicked on impressive option");
	
		d.findElement(By.xpath("//span[text()='Web Tables']")).click();
		Thread.sleep(1000);
		System.out.println("now we have clicked on web tables opton");
		
		
		d.findElement(By.xpath("//button[text()='Add']")).click();
		Thread.sleep(1000);
		System.out.println("now add option has been clicked ");
		
		d.findElement(By.xpath("//input[@id='firstName']")).click();
		Thread.sleep(1000);
		System.out.println("now we have clicked on firstname option");
		
		act.sendKeys("AmeYogita").sendKeys(Keys.TAB).sendKeys("Nalawade").sendKeys(Keys.TAB).sendKeys("ameyogita@gmail.com").build().perform();
		Thread.sleep(1000);
		System.out.println("by using keyboards option we have entered all fields ");
		
		act.sendKeys(Keys.TAB).sendKeys("27").sendKeys(Keys.TAB).sendKeys("03032022").sendKeys(Keys.TAB).sendKeys("love").build().perform();
		Thread.sleep(1000);
		
		
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		System.out.println("we have scroll down ");
		
		d.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(1000);
		System.out.println("submit button is clicked ");
		
		d.findElement(By.xpath("//span[text()='Buttons']")).click();
		Thread.sleep(1000);
		System.out.println("clicking on buttons option");
	
		WebElement doubleClickBtn = d.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		act.doubleClick(doubleClickBtn).perform();
		System.out.println("we are using mouse option to click on doubleClickBtn ");
		
		
		WebElement rightClickBtn = d.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act.contextClick(rightClickBtn).perform();
		Thread.sleep(1000);
		System.out.println("we are using mouse option to click on rightClickBtn ");
		
		WebElement clickMe = d.findElement(By.xpath("//button[text()='Click Me']"));
		act.click(clickMe).perform();
		Thread.sleep(1000);
		System.out.println("");
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1000);
		System.out.println("we are using mouse option to click on Click Me ");

	}

}
