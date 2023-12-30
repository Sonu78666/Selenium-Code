package practice.sele.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement username=driver.findElement(By.xpath("//input[@id='input-email']"));
		WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
		
		Actions act =new Actions(driver);
		//Enterning in capital letters
		//act.keyDown(username, Keys.SHIFT).sendKeys("sonu yadav").build().perform();
		
		//copy paste
		/*
		username.click();
		username.sendKeys("Sonu");
		act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		password.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		*/
		//Scroll page up and down
		//act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		//act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		Thread.sleep(5000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();
	}

}
