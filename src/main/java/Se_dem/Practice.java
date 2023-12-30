package Se_dem;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		/* ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver(option);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/77880/rsa-vs-ind-2nd-odi-india-tour-of-south-africa-2023-24");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String bowlername=driver.findElement(By.xpath("//a[text()=' Ruturaj Gaikwad ']/parent::div/following-sibling::div/span")).getText();
		System.out.println(bowlername);
		String batname=driver.findElement(By.xpath("//span[text()='lbw b Nandre Burger']/parent::div/preceding-sibling::div/a")).getText();
		System.out.println(batname);
		String score_bat=driver.findElement(By.xpath("(//div[text()='12']/parent::div//a)[1]")).getText();
		System.out.println(score_bat);
		*/
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(4000);
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'aswift_3')]")));
		driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
		
		Set<String> h1=driver.getWindowHandles();
		Iterator<String>it1=h1.iterator();
		String parentwindow=it1.next();
		String child1=it1.next();
		driver.switchTo().window(child1);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentwindow);
		System.out.println("first time");
		Thread.sleep(3000);
		//second time coming and clicking same button
		driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
		String childwind=driver.getWindowHandle();
		driver.switchTo().window(childwind);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentwindow);
		System.out.println("i am on parent");

		/*Set<String> h2=driver.getWindowHandles();
		Iterator<String>it2=h2.iterator();
		String parentwindow2=it2.next();
		String child2=it2.next();
		driver.switchTo().window(child2);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentwindow2);
		System.out.println("Second time");
		*/
	}

}
