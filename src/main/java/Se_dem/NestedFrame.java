package Se_dem;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://selectorshub.com/iframe-scenario/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame("pact1");
		driver.findElement(By.xpath("//input[@id='inp_val']")).sendKeys("sonu");
		driver.switchTo().frame("pact2");
		driver.findElement(By.cssSelector("input#jex")).sendKeys("alwys");
		driver.switchTo().frame("pact3");
		driver.findElement(By.cssSelector("input#glaf")).sendKeys("elel");
		driver.switchTo().parentFrame();
		driver.findElement(By.cssSelector("input#jex")).sendKeys("alwys");
		driver.switchTo().defaultContent();
		

	}

}
