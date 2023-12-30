package Se_dem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSuugestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		
		//find all the language links on google home page an click on any link
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		/*By lang=By.xpath("//div[@id='SIvCob']/a");
		List<WebElement>list=driver.findElements(lang);
		System.out.println(list.size());
		for(WebElement e:list)
		{
			String text=e.getText();
			System.out.println(text);
			if(text.contains("ਪੰਜਾਬੀ"))
			{
				e.click();
				break;
				
			}
		}
		*/
		driver.manage().window().maximize();
		By search=By.xpath("//input[@name='p']");
		driver.findElement(search).sendKeys("Naveen Automation labs");
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
		By suggestxpath=By.xpath("//ul[@role='listbox']/li[@role='option']/span[@class='sa-item-title']");
        List<WebElement>suggestlist=driver.findElements(suggestxpath);
        System.out.println(suggestlist.size());
        for(WebElement e:suggestlist)
        {
        	String text=e.getText();
        	System.out.println(text);
        	if(text.contains("naveen automation labs"))
        	{
        		e.click();
        		break;
        	}
        }
		
	}

}
