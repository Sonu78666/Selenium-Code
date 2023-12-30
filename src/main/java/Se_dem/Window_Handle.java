package Se_dem;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Window_Handle {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		
		Set<String>handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		
		String parentwindowid=it.next();
		System.out.println(parentwindowid);
		
		String childid=it.next();
		System.out.println(childid);
		
		driver.switchTo().window(childid);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentwindowid);
		System.out.println(driver.getCurrentUrl());;
	}

}
