package practice.sele.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice_Webtable {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver(option);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		while(true)
		{
			if(driver.findElements(By.xpath("//td[text()='Canada']")).size()>0)
			{
				selectCountry("Canada");
				break;
			}
			else
			{
				WebElement next=driver.findElement(By.xpath("//a[text()='Next']"));
				if(next.getAttribute("class").contains("paginate_button next disabled"))
				{
					System.out.println("country not found");
					break;
				}
				next.click();
			}
		}

	}

	private static void selectCountry(String string) {
		driver.findElement(By.xpath("//td[text()='"+string+"']/preceding-sibling::td/input[@type='checkbox']")).click();
		
	}

}
