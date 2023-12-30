package Se_dem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableMultipleSelectionPagination {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver(option);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		while(true)
		{
			if(driver.findElements(By.xpath("//td[text()='India']")).size()>0)
			{
				selectMultipleCountry("India");
				
			}
			WebElement next=driver.findElement(By.xpath("//a[text()='Next']"));
			if(next.getAttribute("class").contains("disabled"))
			{
				System.out.println("country not found");
				break;
				
			}
			next.click();
			Thread.sleep(1000);
		}
		

	}
	private static void selectMultipleCountry(String name) {
		
		List<WebElement>ele=driver.findElements(By.xpath("//td[text()='"+name+"']/preceding-sibling::td/input[@type='checkbox']"));
		for(WebElement e:ele)
		{
			e.click();
		}
	}

}
