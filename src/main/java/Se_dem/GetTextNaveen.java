package Se_dem;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTextNaveen {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver(option);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		
		By panel=By.xpath("//aside[@id='column-right']//a");
		/*List<WebElement>panelist=driver.findElements(panel);
		for(WebElement e:panelist)
		{
			String text=e.getText();
			System.out.println(text);
		}
		*/	
		List<String> ptext=getTextutil(panel);
		System.out.println(ptext);
	}
	
	public static List<WebElement> findElements(By locator)
	{
		return driver.findElements(locator);
	}
	public static List<String> getTextutil(By locator)
	{
		 List<String> addlist=new ArrayList<String>();
		 List<WebElement> list=findElements(locator);
		 for(WebElement e:list)
			{
				String text=e.getText();
				addlist.add(text);
			}
		 return addlist;
		 
	}

}
