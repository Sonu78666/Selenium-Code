package practice.sele.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebtablePractic {

	static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver(option);
		/*driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		int row=driver.findElements(By.xpath("//table[@class='ws-table-all']//tr")).size();
		System.out.println(row);
		int col=driver.findElements(By.xpath("//table[@class='ws-table-all']//th")).size();
		//print specific row
		System.out.println("Printing row");
		List<WebElement> list=driver.findElements(By.xpath("((//table[@class='ws-table-all'])//tr)[3]"));
		for(WebElement e:list)
		{
			String s=e.getText();
			System.out.println(s);
		}
		//print specific col
		System.out.println("Printing col");
		//table[@id='customers']//tr[2]/td[3]
		//table[@id='customers']//tr[3]/td[3]
		//table[@id='customers']//tr[4]/td[3]
		String beforexpath="//table[@id='customers']//tr[";
		String afterxpath="]/td[3]";

		for(int i=2;i<=7;i++)
		{
			String rowxpath=beforexpath+i+afterxpath;
			String text=driver.findElement(By.xpath(rowxpath)).getText();
			System.out.println(text);
		}
		*/
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/76759/mls-vs-syt-12th-match-big-bash-league-2023-24");
		/*
		 * List<WebElement> list=driver.findElements(By.
		 * xpath("(//div[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']//div)[3]//div"
		 * )); for(WebElement e:list) { String s=e.getText(); System.out.print(s); }
		 */
		
		//(//a[text()=' Stoinis ']/parent::div/following-sibling::div)[5]
		//((//div[@class='cb-col cb-col-100 cb-scrd-itms'])[1]/div)[6]
		// (//div[@class='cb-col cb-col-100 cb-scrd-itms'])[1]/div[6]
		//(//div[@class='cb-col cb-col-100 cb-scrd-itms'])[1]/div[6]

		String beforexpath="(//div[@class='cb-col cb-col-100 cb-scrd-itms'])[";
		String afterxpath="]/div[6]";

		for(int i=1;i<=1
			
				;i++)
		{
			String rowxpath=beforexpath+i+afterxpath;
			String text=driver.findElement(By.xpath(rowxpath)).getText();
			System.out.println(text);
		}
		
	}

}
