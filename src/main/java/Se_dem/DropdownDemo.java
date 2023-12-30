package Se_dem;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class DropdownDemo {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver(option);
		driver.get("https://seleniumbase.io/demo_page");
		driver.manage().window().maximize();
		By product=By.id("mySelect");
		
		// way-1 without generics
		//Select sc=new Select(driver.findElement(product));
		//sc.selectByIndex(2);
		//Thread.sleep(3000);
		//sc.selectByValue("100%");
		//Thread.sleep(3000);
		//sc.selectByVisibleText("Set to 50%");
		// way 2-Generics method
		//doSelectByText(product, "Set to 75%");
		
		//way-3 getting all the options and printing all the text
		//Select sc=new Select(driver.findElement(product));
		/*List<WebElement> set=sc.getOptions();
		System.out.println(set.size());
		for(WebElement e:set)
		{
			String text=e.getText();
			System.out.println(text);
			if(text.equals("Set to 50%"))
			{
				e.click();
			}
		}*/
		//way-4 generic way
		
		/*List<String>text=doGetDropdownText(product);
		System.out.println(text);
		if(text.contains("Set to 100%"))
		{
			System.out.println("passed");
		}*/
		
		// way-5 selecting dropdown value without using select class
		
		By pro=By.xpath("//select[@id ='mySelect']/option");
		List<WebElement>ls=driver.findElements(pro);
		for(WebElement e:ls)
		{
			String text=e.getText();
			System.out.println(text);
			if(text.equals("Set to 100%"))
			{
				e.click();
				break;
			}
		}

	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

	public static void doSelectByIndex(By locator,int index)

	{
		WebElement e=getElement(locator);
		Select sc=new Select(e);
		sc.selectByIndex(index);
		
	}
	public static void doSelectByValue(By locator,String value)

	{
		WebElement e=getElement(locator);
		Select sc=new Select(e);
		sc.selectByValue(value);
		
	}
	public static void doSelectByText(By locator,String text)

	{
		WebElement e=getElement(locator);
		Select sc=new Select(e);
		sc.selectByVisibleText(text);
		
	}
	public static List<WebElement> doGetOptions(By loacator)
	{
		Select sc=new Select(getElement(loacator));
		return sc.getOptions();
	}
	public static List<String> doGetDropdownText(By locator)
	{
		List<String> ls=new ArrayList<String>();
		List<WebElement>list=doGetOptions(locator);
		for(WebElement e:list)
		{
			String text=e.getText();
			ls.add(text);
		}
		return ls;
	}
	

}
