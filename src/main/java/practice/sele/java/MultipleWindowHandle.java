package practice.sele.java;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleWindowHandle {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentid=driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement linel=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement fbel=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement twel=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement ytel=driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		
		linel.click();
		fbel.click();
		twel.click();
		ytel.click();
		
		Set<String> handle=driver.getWindowHandles();
		Iterator<String>it=handle.iterator();
		while(it.hasNext())
		{
			String windoid=it.next();
			driver.switchTo().window(windoid);
			System.out.println(driver.getCurrentUrl());
			if(!windoid.equals(parentid))
			{
				driver.close();
			}
		}
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
