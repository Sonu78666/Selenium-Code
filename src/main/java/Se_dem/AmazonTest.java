package Se_dem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonTest {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		//1. find the number of links on webpage
		List<WebElement> listoflink=driver.findElements(By.tagName("a"));
		
		//2.find the count of links
		int linkcount=listoflink.size();
		System.out.println(linkcount);
		int b=0;
		// 3.print the text of all the links
		for(int i=0;i<linkcount;i++)
		{
			
			String text=listoflink.get(i).getText();
			
			if(text.length()>0)
			b=listoflink.size();
			System.out.println(i+":"+text);
		}
		
		

	}

}
