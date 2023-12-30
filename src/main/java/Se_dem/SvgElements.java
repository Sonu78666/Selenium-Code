package Se_dem;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SvgElements {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver(option);
		/*driver.get("https://petdiseasealerts.org/forecast-map/#/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		List<WebElement>list=driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path' ]"));
		System.out.println(list.size());
		for(WebElement e:list)
		{
			String s=e.getAttribute("name");
			System.out.println(s);
		}
		*/
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//*[local-name()='svg' and @width='24']")).click();
		
		
		/* driver.get("https://boringavatars.com/?ref=onepagelove");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		//WebElement e=driver.findElement(By.xpath("(//*[local-name()='svg' and @width=\"80\"]//*[name()='g' and @mask=\"url(#:r7:)\"]//*)[1]"));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//*[local-name()='svg' and @width=\"80\"]//*[name()='g' and @mask=\"url(#:r7:)\"]//*)[1]")))).click();
		*/

	}

}
