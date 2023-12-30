package Se_dem;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		Thread.sleep(3000);
		WebElement linel=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement fbel=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement twel=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement ytel=driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		
		linel.click();
		fbel.click();
		twel.click();
		ytel.click();
		
		Set<String>handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		while(it.hasNext())
		{
			String windowid=it.next();
			driver.switchTo().window(windowid);
			System.out.println(driver.getCurrentUrl());
			if(!windowid.equals(parentid))
			{
				driver.close();
			}
		}
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getCurrentUrl());

	}

}
