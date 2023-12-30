package Se_dem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaticWebTable {
	
		static WebDriver driver;
	   public static void main(String[] args) {
		   
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver(option);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		int rowcount=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println(rowcount);
		int colcount=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		System.out.println(colcount);
		
		//fetching all the values from column 1
		//table[@id='customers']//tr[2]/td[1]
		//table[@id='customers']//tr[5]/td[1]
		//table[@id='customers']//tr[7]/td[1]
		System.out.println("*****Printing specific col");
		String beforexpath="//table[@id='customers']//tr[";
		String afterxpath="]/td[1]";
		for(int i=2;i<=7;i++)
		{
			String xpath=beforexpath+i+afterxpath;
			String value=driver.findElement(By.xpath(xpath)).getText();
			System.out.println(value);
		}
		
		System.out.println("*****Printing specific value from row and col");
		String value=driver.findElement(By.xpath("//table[@id='customers']//tr[4]/td[2]")).getText();
		System.out.println(value);
		
		System.out.println("*****Printing specific row");
	    String rowxpath="//table[@id='customers']//tr[2]/td";
	    List<WebElement>rowlist=driver.findElements(By.xpath(rowxpath));
	    for(WebElement e:rowlist)
	    {
	    	String text=e.getText();
	    	System.out.println(text);
	    }
		
		System.out.println("*****Generic rowcol value");
		
		String rowcolvalue=selectrowcol("3","3");
		System.out.println(rowcolvalue);
	}
	   
	   public static String selectrowcol(String row,String col)
	   {
		   String text=driver.findElement(By.xpath("//table[@id='customers']//tr["+row+"]/td["+col+"]")).getText();
		   return text;
		   
	   }

}
