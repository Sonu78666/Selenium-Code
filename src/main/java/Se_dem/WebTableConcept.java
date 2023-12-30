package Se_dem;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.*;
public class WebTableConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver(option);
		//1.Free CRM pro check box selection
		/*driver.get("https://classic.freecrm.com/");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.name("username"));
		e.sendKeys("sonu7866yadav@gmail.com");
		e.sendKeys(Keys.TAB);
		driver.findElement(By.name("password")).sendKeys("Sonu@1996");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(4000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Ashton cox']/parent::td/preceding-sibling::td/input[@name='contact_id']")).click();
		*/
		//2
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/81475/akl-vs-cntbry-1st-match-super-smash-2023-24");
		driver.manage().window().maximize();
		String text=driver.findElement(By.xpath("//a[text()=' Martin Guptill ']/parent::div/following-sibling::div/span")).getText();
		System.out.println(text);
		//String name=GetBowler("Solia");
		//System.out.println(name);	
		List<WebElement> list=driver.findElements(By.xpath("//a[text()=' Neesham ']/parent::div/following-sibling::div"));
		for(WebElement e:list)
		{
			String s=e.getText();
			System.out.print(s);
		}
		System.out.println("");
		List<String> scorecard=getScoreCard("Solia");
		System.out.println(scorecard);
		
	}
	public static void  selectUser(String name)
	{
		driver.findElement(By.xpath("//a[text()='"+name+"']/parent::td/preceding-sibling::td/input[@name='contact_id']"));
	}
	public static String GetBowler(String batsname)
	{
		return driver.findElement(By.xpath("//a[text()=' "+batsname+" ']/parent::div/following-sibling::div/span")).getText();
	}
	public static List<String> getScoreCard(String batname)
	{
		List<String> score=new ArrayList<String>();
		List<WebElement> list=driver.findElements(By.xpath("//a[text()=' "+batname+" ']/parent::div/following-sibling::div"));
		for(WebElement e:list)
		{
			String s=e.getText();
			score.add(s);
		}
		return score;
	}

}
