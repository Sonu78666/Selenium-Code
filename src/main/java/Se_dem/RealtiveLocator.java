package Se_dem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RealtiveLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.aqi.in/in/dashboard/canada");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.linkText("Terrace, Canada"));
		
		String right=driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(right);
		
		String left=driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(left);
		
		String above=driver.findElement(RelativeLocator.with(By.tagName("a")).above(ele)).getText();
		System.out.println(above);
		
		String below=driver.findElement(RelativeLocator.with(By.tagName("a")).below(ele)).getText();
		System.out.println(below);
		
	}

}
