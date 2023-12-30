package Se_dem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SliderConcept {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		
		
		
		
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://jqueryui.com/slider/");
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement ele = driver.findElement(By.xpath("//div[@id='slider']"));
		ele.click();
		int width = ele.getSize().getWidth();
		Actions act = new Actions(driver);
		// act.moveToElement(ele,(width/2)-30,0).click().build().perform();
		act.clickAndHold(ele).moveByOffset(-((width / 2) - 30), 0).click().build().perform();

	}

}
