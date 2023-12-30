package Se_dem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.id("input-email")).sendKeys("Sonu7866yadav@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("Son@1996");
		//driver.findElement(By.id("input-password")).click();
		/*ElementUtil e=new ElementUtil(driver);
		By imglogo=By.className("img-responsive");
		By search=By.name("search");
		boolean vlogo=driver.findElement(imglogo).isDisplayed();
		boolean vsearch=driver.findElement(search).isDisplayed();
		if(e.isDisplayed(imglogo))
		{
			System.out.println("logo is visible");
		}
		if(e.isDisplayed(search))
		{
			System.out.println("search field is visible");
			e.doSendKeys(search, "Mobile");
		}
		
		
		System.out.println("sucessfu");
		//driver.quit();
		*/
		
	}
	

}
