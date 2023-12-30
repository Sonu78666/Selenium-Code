package Se_dem;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertConcept {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1. simple alert
		/*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
		*/
		
		//2. confirm alert
		/*driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		//alert.accept();
		alert.dismiss();
		*/
		
		//3.Prompt
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		Thread.sleep(3000);
		alert.sendKeys("Sonu rockstar");
		alert.accept();
		

	}

}
