package Se_dem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame_Concept {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("main"));
		String s=driver.findElement(By.tagName("h2")).getText();
		System.out.println(s);
		/*FluentWait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
										.withTimeout(Duration.ofSeconds(3))
										.ignoring(StaleElementReferenceException.class)
										.pollingEvery(Duration.ofSeconds(1));
										*/		
		/*
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(3000);
		int size=driver.findElements(By.tagName("frame")).size();
		System.out.println(size);
		driver.switchTo().frame("main");
		String s=driver.findElement(By.tagName("h2")).getText();
		System.out.println(s);
		driver.switchTo().defaultContent();
		*/
		

	}

}
