package Se_dem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon_Attribute {

	static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver(option);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		By tagname=By.tagName("a");
		
		/*List<WebElement>linkslist=getElements(tagname);
		System.out.println(linkslist.size());
		for(WebElement e:linkslist)
		{
			String href=e.getAttribute("href");
			String text=e.getText();
			System.out.println(text+"-->"+href);
		}
		*/
		getElementAttribute(tagname, "href");
	}

    public static void getElementAttribute(By locator,String value){
		List<WebElement> list=getElements(locator);
		for(WebElement e:list)
		{
			String attribute_text=e.getAttribute("value");
			System.out.println(attribute_text);
		}
		
	}
	public static List<WebElement> getElements(By loactor){
		return driver.findElements(loactor);
	}
	public static int size(By locator)
	{
		List<WebElement> e=getElements(locator);
		int count=e.size();
		System.out.println(count);
		return count;
	}
}

	