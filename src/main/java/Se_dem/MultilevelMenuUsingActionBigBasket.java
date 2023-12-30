package Se_dem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MultilevelMenuUsingActionBigBasket {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(2000);
		WebElement lv1=driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bab6:']"));
		Actions act=new Actions(driver);
		act.moveToElement(lv1).click().build().perform();
		Thread.sleep(2000);
		WebElement lv2=driver.findElement(By.linkText("Beverages"));
		act.moveToElement(lv2).build().perform();
		Thread.sleep(2000);
		WebElement lv3=driver.findElement(By.linkText("Coffee"));
		act.moveToElement(lv3).build().perform();
		Thread.sleep(2000);
		WebElement lv4=driver.findElement(By.linkText("Instant Coffee"));
		act.moveToElement(lv4).click().build().perform();
	
		
	}

}
