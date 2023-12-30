package Se_dem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionConcept {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		
		//driver.get("http://mrbool.com/search/");
		//1-Moving Mouse to menu then selecting sub-menu
		/*WebElement ele=driver.findElement(By.cssSelector("a.menulink"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("COURSES")).click();
		*/
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
		act.contextClick(ele).build().perform();
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//ul/li/span"));
		
		for(WebElement e:list)
		{
			String text=e.getText();
			System.out.println(text);
			if(text.equals("Cut"))
			{
				e.click();
				break;
			}
		}
		
		
		
	}

}
